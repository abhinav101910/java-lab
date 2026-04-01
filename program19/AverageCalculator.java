import java.util.Scanner;
class NegativeNumberException extends Exception {
public NegativeNumberException(String message) {
super(message);
}
}
public class AverageCalculator {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int num1, num2, num3, num4;
System.out.println("Enter 4 numbers:");
num1 = sc.nextInt();
num2 = sc.nextInt();
num3 = sc.nextInt();
num4 = sc.nextInt();
try {
if (num1 < 0 || num2 < 0 || num3 < 0 || num4 < 0) {
throw new NegativeNumberException("Negative numbers not allowed");
}
double average = (num1 + num2 + num3 + num4) / 4.0;
System.out.println("Average = " + average);
} 
catch (NegativeNumberException e) {
 System.out.println("Exception: " + e.getMessage());
}
sc.close();
}
}
