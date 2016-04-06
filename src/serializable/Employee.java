package serializable;

import java.io.Serializable;

/**
 * Created by Yuriy on 06.04.2016.
 */
public class Employee implements Serializable{
    private static final long serialVersionUID=1L;

    private String name;
    private String address;
    transient private int SSN;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name: " + name +
                " address: " + address +
                " SSN: " + SSN +
                " number: " + number;
    }
}
