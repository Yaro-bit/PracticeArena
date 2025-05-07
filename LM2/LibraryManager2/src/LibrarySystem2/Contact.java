package LibrarySystem2;

public class Contact {
    String name;
    String phoneNumber;
    String email;
    String address;

    Contact() {
        name = "unknown";
        phoneNumber = "unknown";
        email = "unknown";
        address = "unknown";
    }

    public Contact(String name, String phoneNumber, String email, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address + "]";
    }
}
