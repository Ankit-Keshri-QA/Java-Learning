package oops;

public class Student {
    private String name;
    private int age;
    private String rollNo;

    // Default Constructor
    public Student() {
    }


    // All Parameter Constructor
    public Student(String name, String rollNo) {
        this.name = name;
        this.age = 10;
        this.rollNo = rollNo;
    }

    // Contructor Overloading
    public Student(String name, int age, String rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Contructor Overloading
    public Student(String name) {
        this.name = name;
    }


    //Getters nd setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Ankit");
        stu.setAge(22);
        stu.setRollNo("1CR16CS021");

        System.out.println(stu.toString());

        Student stu1 = new Student("Vaibhav", "1CR16IS117");
        System.out.println(stu1.getAge());

    }

}
