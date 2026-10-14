import java.util.Scanner;

public class IT24104085Lab3Q4 {

    public static void main(String[] args) {

         int number ;

         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter a five-digit number: ");
         number = input.nextInt(); //12345
         

         int n=number/10000; //1
         int r1=number%10000; //2345

         int n1= r1/1000; //2
         int r2 = r1%1000; //345
         
         int n2 = r2/100; //3
         int r3 = r2%100; //45
       
         int n3 = r3/10; //4
         int r4 = r3%10; //5

         
         System.out.println(" ");
        // System.out.println("5 2 3 4 8");

         System.out.print(n+" " );
         System.out.print(n1+" ");
         System.out.print(n2+" ");
         System.out.print(n3+" ");
         System.out.print(r4);


       }
}
