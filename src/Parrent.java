import java.io.Serializable;

/**
 * @author Polina_Khainson
 * @date 4/20/2016
 */
public abstract class Parrent implements Serializable {
    public int id;
    public Parrent(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
