/**
 * @author: Elias Zalles
 * Module 14: Assignment - Chapter 11, Problem 1
 * I'll write a program that will search a text file of strings representing numbers of type int.
 **/
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
 
 public class Chapter11file
{
/**
 
 * Adds public static main method with string args  
 * @param String num, minNum, fullNum
 * @param int num, sum, count
 * try
 * @catch
 * @adds public void closeFile
 **/
    private static Scanner file1;
     
  public static void main(String[] args){
      int num;
      int sum = 0;
      int count = 0;
      int fullNum = Integer.MIN_VALUE;
      int minNum = Integer.MAX_VALUE;

      try{
       file1 = new Scanner(new File("data.txt"));
       while(file1.hasNext()){
            num = Integer.parseInt(file1.nextLine());//value to compare to
                if (num < minNum){
                    minNum = num;
                }
                if (num > fullNum){
                    fullNum = num;
                }
            count++;
            sum += num;
        }
        }catch (FileNotFoundException e){
            System.out.println("File was not found.");
         }finally{
            file1.close();
         }
       System.out.println("Average of the integers in the file: " + (sum/count));
       System.out.println("Sum of the integers in the file: " + sum);
       System.out.println("A count of integers in the file: " + count);
       System.out.println("Smallest integer in the file: " + minNum);
       System.out.println("Largest integer in the file: " + fullNum);
   }
}
   