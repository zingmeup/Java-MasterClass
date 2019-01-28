package packageabc;

class Address{
    String city,state;
    int pin;

    public Address(String city, String state, int pin) {
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "\t"+"City: "+this.city+"\n "
                +"\t"+"State: "+this.state+"\n "
                +"\t"+"Pincode: "+this.pin+"\n ";
    }
}

class Student{
    private String name, uid;
    byte age;
    Address address;

    public Student(String name, String uid, byte age, Address address) {
        this.name = name;
        this.uid = uid;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student Name: "+this.name+"\n"
                +"Studnet UID: "+this.uid+"\n"
                +"Student Age"+this.age+"\n"
                +"Student Address:\n"+this.address+"\n ";
    }
}

public class Launcher {
    public static void main(String[] args) {
        Address address=new Address("chd", "punjab", 140413);
        Student s1=new Student("Ashik", "17bcs1520", (byte)20, address);
        System.out.println(s1);

    }

}
