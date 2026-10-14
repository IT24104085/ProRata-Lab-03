import java.util.Scanner;

public class IT24104085Lab3Q1B {

    public static void main(String[] args) {

         double pricePerKg , quantity, totalAmount, totalDiscount, sellingAmount;

         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter the price of 1Kg of rice: ");
         pricePerKg = input.nextDouble();

         System.out.print("Enter the price of kilograms you want to buy: ");
         quantity = input.nextDouble();

         totalAmount = pricePerKg * quantity;
         totalDiscount = totalAmount * 0.1;
         sellingAmount = totalAmount - totalDiscount; 

      System.out.println(" ");
      System.out.println("The total amount with 10% disount is: " + sellingAmount);


       }
}
