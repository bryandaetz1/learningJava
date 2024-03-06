public class Main {
    public static void main(String[] args) {
        int age = 7;
        int ticketPrice = calculateTicketPrice(age);
        System.out.println("Ticket Price: $" + ticketPrice);
    }

    public static int calculateTicketPrice(int age){
        if (age < 5){
            return 0;
        } else if (age < 12){
            return 5;
        } else if (age < 18){
            return 10;
        } else {
            return 15;
        }
    }
}
