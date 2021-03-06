package mypackage;

import java.util.Arrays;

/**
 * Created by emilbikj on 11.05.2017.
 */
public class Person extends Record {

    private String firstName;
    private String lastName;
    private String[] phone;
    private String email;
    private String address;

    public String[] getPhone() {
        return phone;
    }

    void setPhone(String[] phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }


    public String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Record{id: " + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + Arrays.toString(phone) +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
