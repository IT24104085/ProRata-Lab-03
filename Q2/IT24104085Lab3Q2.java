import java.util.Scanner;

public class IT24104085Lab3Q2 {

    public static void main(String[] args) {

         double MonthlySalary, TotalSalary, OTHours, OTAmount, OTHourlyRate ;

         Scanner input= new Scanner(System.in);
         
         System.out.print("Enter the monthly salary: ");
         MonthlySalary = input.nextDouble();

         System.out.print("Enter the number of OT hours: ");
         OTHours = input.nextDouble();

         System.out.print("Enter the OT hourly rate: ");
         OTHourlyRate = input.nextDouble();
         
         OTAmount = OTHours * OTHourlyRate;
         TotalSalary = MonthlySalary + OTAmount;
         
         System.out.println(" ");
         System.out.println("The total salary including OT is: " + TotalSalary);


       }
}
