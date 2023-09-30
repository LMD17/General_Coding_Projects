
package classes.constructors.and.mthods.denominator;

public class Invoice implements Payable{

    @Override
    public void getPaymentAmount() {
        System.out.println("Multiply the quantity by the number of items bought.");
    }

    @Override
    public void viewPayment() {
        System.out.println("Payment is going to be displayed on the screen");
    }
    
}
