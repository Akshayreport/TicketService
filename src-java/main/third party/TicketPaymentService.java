package thirdparty;

public class TicketPaymentService {
    public static void TicketPaymentService(int totalPrice) {
        //Third party Payment implementation
        System.out.println("Payment completed");
        System.out.println("You paid £" + totalPrice);
    }
}
