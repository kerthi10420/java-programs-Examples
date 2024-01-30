import java.util.Scanner;
public class MultiplyNumbers{
    public static void main(String[] args){
        int num1, num2, product;
        
        // Asking for input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        
        // Multiplication of two numbers
        product = num1 * num2;
        
        // Displaying output
        System.out.println("The product of two numbers: "+ product);
    }
}