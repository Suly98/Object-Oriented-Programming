import java.util.Scanner;

public class Person {
    private String name;
    private String age;


    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person(sc.next(), sc.next());


        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}

