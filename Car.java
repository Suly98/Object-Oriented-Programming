public class Car {
    private String make;
    private String model;
    public Integer year;


    public Car(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getFullDetails(){
        return make + " " + model + year;
    }

    public static void main(String[] args) {
        Car fordMustang = new Car("Ford", "Mustang GT", 2004);

        System.out.println(fordMustang.model);
    }
}

