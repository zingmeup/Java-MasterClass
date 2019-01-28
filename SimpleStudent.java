package packageabc;

class Student{
    private String name, uid;
    byte age;

    public Student(String name, String uid, byte age) {
        this.name = name;
        this.uid = uid;
        this.age = age;
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
        return this.name+" "+this.uid+" "+this.age;
    }
}

public class SimpleStudent{
    public static void main(String[] args) {
        Student s1=new Student("Ashik", "17bcs1520", (byte)20);
        System.out.println(s1);

    }

}
