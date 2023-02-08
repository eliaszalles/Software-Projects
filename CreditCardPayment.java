/**
 * @author: Elias Zalles
 * Module 13: Assignment - Chapter 10, Problem 1
 * I'll define a class named CreditCardPayment that is derived from Payment. 
 **/
import java.util.Scanner;
public class CreditCardPayment
{

/**
 
 * Adds public static main method with string args  
 * @String currency
 * @System.out.print:
 * @Scanner input
 * @return toString
 **/
 static Scanner input = new Scanner (System.in);
 
 public static void main(String[] args)
 {
 System.out.print("The card name is: ");
 String cardName = input.nextLine();
 System.out.print("The expiration date is: ");
 double date = input.nextDouble();
 System.out.print("The card name is: ");
 int cardNum = input.nextInt();

  }
  public String paymentDetails()
 {
  System.out.print("The amount for paymentDetails is: ");
  return String.format("toString");
 }
}