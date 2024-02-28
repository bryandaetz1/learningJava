public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Charlie Kelly");
        person.setAge(34);

        System.out.println("Name: " + person.getName());
        System.out.println(("Age: " + person.getAge()));
    }
}
