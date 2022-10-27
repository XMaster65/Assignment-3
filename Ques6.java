import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0)
            this.quantity = 0;
        else
            this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
            this.price = 0.0;
        else
            this.price = price;
    }

    public double getInvoiceAmount() {
        return price * quantity;
    }
}

public class Ques6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Part Number: ");
        String partNumber = reader.readLine();
        System.out.println("Enter Part Description: ");
        String partDescription = reader.readLine();
        System.out.println("Enter Quantity: ");
        int quantity = Integer.parseInt(reader.readLine());
        System.out.println("Enter price per item: ");
        double price = Double.parseDouble(reader.readLine());
        Invoice obj = new Invoice(partNumber, partDescription, quantity, price);
        System.out.println("Invoice Amount: " + obj.getInvoiceAmount());
    }
}
