import java.util.Scanner;

public class IT24104085Lab3Q3 {

    public static void main(String[] args) {

         //double amount, Rupes, Notes;

         Scanner input= new Scanner(System.in);
        
         int amount;
         int count5000=0, count1000=0, count500=0, count200=0, count100=0, count50=0, count20=0, count10=0, count5=0, count2=0, count1=0;
         
         System.out.print("Enter the Rupee amount: ");
         amount = input.nextInt();

    
      	 if(amount >= 5000) {
             count5000 = amount/5000;
             amount = amount%5000;
         }
         if (amount >= 1000){
             count1000 = amount/1000;
             amount = amount%1000;
         }
         if (amount >= 500){
             count500 = amount/500;
             amount = amount%500;
         }
         if(amount >= 200) {
             count200 = amount/200;
             amount = amount%200;
         }
         if (amount >= 100){
             count100 = amount/100;
             amount = amount%100;
         }
         if (amount >= 50){
             count50 = amount/50;
             amount = amount%50;
         }
         if(amount >= 20) {
             count20 = amount/20;
             amount = amount%20;
         }
         if (amount >= 10){
            count10 = amount/10;
            amount = amount%10;
         }
         if (amount >= 5){
            count5 = amount/5;
            amount = amount%5;
         }
         if (amount >= 2){
            count2 = amount/2;
            amount = amount%2;
         }
         if (amount >= 1){
            count1 = amount/1;
            amount = amount%1;
         }

       // System.out.println(" ");
       // System.out.println("The total Notes: " + TotalNotes);

         System.out.println("5000 Notes: " + count5000);
         System.out.println("1000 Notes: " + count1000);
         System.out.println("500 Notes: " + count500);
         System.out.println("200 Notes: " + count200);
         System.out.println("100 Notes: " + count100);
         System.out.println("50 Notes: " + count50);
         System.out.println("20 Notes: " + count20);
         System.out.println("10 Coins: " + count10);
         System.out.println("05 Coins: " + count5);
         System.out.println("02 Coins: " + count2);
         System.out.println("01 Coins: " + count1);

    }
}