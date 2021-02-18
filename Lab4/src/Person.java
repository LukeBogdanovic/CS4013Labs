public class Person {
    
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String n,String a, String pn, String e) {
        this.name = n;
        this.address = a;
        this.phoneNumber = pn;
        this.email = e;
    }

    public String toString() {
        return "Name:" + name + " Address:" + address + " Phone Number:" + phoneNumber + " Email Address:" + email;
    }

}
