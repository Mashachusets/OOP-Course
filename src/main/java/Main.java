public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("25","Printer",-10,20);
        invoice.partNumber = "1";
        System.out.println("Item part number is: " + invoice.partNumber + " and invoice amount is: " + invoice.getInvoiceAmount());
        Invoice invoice1 = new Invoice("24","Keyboard",10,-20);
        invoice1.partDescription = "Processor";
        System.out.println("Item part description is: " + invoice1.partDescription + " and invoice amount is: " + invoice1.getInvoiceAmount());
        Invoice invoice2 = new Invoice("24","Monitor",10,-20);
        invoice2.itemPrice = 10;
        System.out.println("Item price is: " + invoice2.itemPrice + " and invoice amount is: " + invoice2.getInvoiceAmount());
        Invoice invoice3 = new Invoice("24","Mouse",-20,10);
        invoice3.itemQuantity = 15;
        System.out.println("Item quantity is: " + invoice3.itemQuantity + " and invoice amount is: " + invoice3.getInvoiceAmount());
    }
}