import java.util.Scanner;

public class PersonDetails {


    private String firstName;
    private String lastName;

    public PersonDetails(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersonDetails person = new PersonDetails("Sulaiman", "Al Hudaifi");

        System.out.println("The person's name is: " + person.firstName);
        System.out.println("The person's last name is: " + person.lastName);

    }
}

