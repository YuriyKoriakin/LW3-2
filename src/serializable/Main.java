package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Yuriy on 06.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("Vasya");
        employee.setAddress("Kyiv");
        employee.setSSN(1234567890);
        employee.setNumber(10);
        ObjectOutputStream oos=null;
      try {
          FileOutputStream fos = new FileOutputStream("employee.ser");
          oos=new ObjectOutputStream(fos);
          oos.writeObject(employee);
      }catch (IOException e){
          e.printStackTrace();
      }finally {
          if (oos !=null);
          try {
              oos.close();
          }catch (IOException e) {
              e.printStackTrace();
          }
          }
      }
    }

