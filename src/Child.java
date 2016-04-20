import java.io.Serializable;

/**
 * @author Polina_Khainson
 * @date 4/20/2016
 */
public class Child extends Parrent implements Serializable{
    public String name;

    public Child(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
