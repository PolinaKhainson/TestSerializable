import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Polina_Khainson
 * @date 4/20/2016
 */
public class SerializationDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.setId(5);
        child.setName("Ilya");
        try{
            FileOutputStream fos = new FileOutputStream("child.ser");
            ObjectOutputStream objos = new ObjectOutputStream(fos);
            objos.writeObject(child);
            objos.close();
            fos.close();
            System.out.println("Serialized" + child);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
