package interfaces.payable;

public class InterfacesPayable {

    public static void main(String[] args) {

        Invoice inv = new Invoice();

        Employee emp1 = new Employee();

        System.out.println("");
        System.out.println("HERE IS THE OUTPUT FOR INVOICE CLASS");
        inv.getPaymentAmount();
        inv.viewPayment();
        System.out.println("");
        System.out.println("HERE IS THE OUTPUT FOR EMPLOYEE CLASS");
        emp1.getPaymentAmount();
        emp1.viewPayment();
    }

}
