public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Speed Racer";

        Car car = new Car();
        car.model = "BMW i8";
        car.owner = person;

        System.out.println("Car model: " + car.model);
        System.out.print("Car owner: " + car.owner.name);
    }
}
