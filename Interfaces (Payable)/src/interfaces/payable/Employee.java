
package interfaces.payable;

public class Employee implements Payable {

    @Override
    public void getPaymentAmount() {
        System.out.println("Multiply the rate by the number of hours worked");
    }

    @Override
    public void viewPayment() {
        System.out.println("Payment is going to be printed");
    }
}
