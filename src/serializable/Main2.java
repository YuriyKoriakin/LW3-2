package serializable;

import java.io.*;

/**
 * Created by Yuriy on 06.04.2016.
 */
public class Main2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("employee.ser");
            ois = new ObjectInputStream(fis);
            Employee employee = (Employee) ois.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}





