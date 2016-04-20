import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Polina_Khainson
 * @date 4/20/2016
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        Child child = null;
        try {
            FileInputStream fis = new FileInputStream("child.ser");
            ObjectInputStream objis = new ObjectInputStream(fis);
            child = (Child) objis.readObject();
            System.out.println("Child" + child.getId() + " " + child.getName() );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
