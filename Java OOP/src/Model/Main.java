package Model;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Juan DelaCruz");
        System.out.println(student.getName());
        student.setAge(21);
        System.out.println(student.getAge());
        student.setGender("Male");
        System.out.println(student.getGender());
        student.setStudentNumber(202210100);
        System.out.println(student.getStudentNumber());
    }
}