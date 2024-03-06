public class ModifyPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John Smith";
        person.age = 38;
        printPersonInfo(person);
        modifyPerson(person);
        printPersonInfo(person);
    }

    public static void printPersonInfo(Person p){
        System.out.println("Name: " + p.name + "; Age: " + p.age);
    }

    public static void modifyPerson(Person p){
        p.name = "Jane Doe";
        p.age = 22;
    }
}
