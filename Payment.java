/**
 * @author: Elias Zalles
 * Module 13: Assignment - Chapter 10, Problem 1
 * I'll define  a class named Payment that contains an instance variable "paymentAmount" of type double that stores the amount of the payment and appropriate accessor (getPaymentAmount() ) and mutator methods.
 **/
import java.util.Scanner;
public class Payment
{

/**
 
 * Adds public static main method with string args  
 * @String paymentDetails
 * @System.out.print: The amount for paymentAmount is:
 * @Scanner input
 * @return toString
 **/
  
 private double paymentAmount;
  public Payment(){
   this.paymentAmount = 0;
  }
  public Payment(double paymentAmt){
   this.paymentAmount = paymentAmt;
  }
  public double getPaymentAmount(){
  return paymentAmount;
  }
  public void setPaymentAmount(double amount){
   this.paymentAmount = amount;
  }
  public String paymentDetails(){
  return ("\nThe Payment Amount: " + this.paymentAmount);
  }
  @Override
  public String toString(){
  return paymentDetails();
  }
 public static void main(String[] args)
 {
  CashPayment cashOne = new CashPayment(200.50, "Dollars");
  CashPayment cashTwo = new CashPayment(400.50,"Euro");
  CreditCardPayment cardOne = new CreditCardPayment(20.25, "Elias Zalles", "08/21", "7252468474743754" ); 
  CreditCardPayment cardTwo = new CreditCardPayment(150.45, "Elias Zalles", "07/25", "3256468484743754" );
  Payment[] payments ={cashOne, cardOne, cashTwo, cardTwo};
  for(Payment p: payments){
  System.out.println(p.toString());
  }
 }

  public static class CashPayment extends Payment{
   private String type;
  public CashPayment(double amount, String type){
   super(amount);
   this.type = type;
  } 
  public String getType(){
   return this.type;
  }
  public void setType(String currencyType){
   this.type = currencyType;
  }
  @Override
  public String paymentDetails()
 {
  return String.format("\nCash Payment:\nAmount: %.2f %s", getPaymentAmount(), this.type);
 }
 @Override
  public String toString(){
  return paymentDetails();
  }
  }
  public static class CreditCardPayment extends Payment{
  private String cardName;
  private String date;
  private String cardNum;
  
  public CreditCardPayment(double amount, String cardName, String date, String cardNum){
   super(amount);
   this.cardName = cardName;
   this.date = date;
   this.cardNum = cardNum;
  }
  public String getCardName(){
   return this.cardName;
  }
  public void setCardName(String name){
   this.cardName = name;
  }
 public String getExpDate(){
   return this.date;
  }
  public void setExpDate(String date){
   this.date = date;
  }
  public String getCardNum(){
   return this.cardNum;
  }
  public void setCardNum(String num){
   this.cardNum = num;
  }
  @Override
  public String paymentDetails(){
  return ("\nCard Payment: \nAmount: "+ getPaymentAmount() + "\nName on card: " + this.getCardName() +"\nExpiration Date: "+ this.getExpDate() + "\nCard Number: " + this.getCardNum());
  }
  @Override
  public String toString(){
  return paymentDetails();
  }

  }
  }