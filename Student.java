import java.util.Scanner;

public class Student {
    private String name;
    private Integer age;
    private Float grade;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.next();
        student.age = sc.nextInt();
        student.grade = sc.nextFloat();

        System.out.println("The student Name is: "+ student.name);
        System.out.println("The student Age is: "+ student.age);
        System.out.printf("The student Grade is: "+ student.grade);

    }
}

