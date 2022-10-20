import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Read 10 numbers from the console entered by the user and print the sum of those numbers
       //Create a Scanner like we did in the previous video
       //Use the hasNextInt() method from the scanner to check if the user has entered an int value
       //If hasNextInt() returns false, print the message "Invalid Number". Continue reading until
       //you have read 10 numbers.
       //Use the nextInt() method to get the number and add it to the sum.
       //Before the user enters each number, print the message "Enter number #x: "Where x represents
       //the count, 1,2,3,4, etc.
       //Hint: use a while loop, use a counter variable for counting valid numbers
       //close the scanner after you don't need it anymore
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a valid number : ");
       int totalSum = 0;
       boolean isANumber = scanner.hasNextInt();
       if(isANumber){
        int countNumber = 1;
        while(countNumber < 11){
         System.out.println("Enter number # " + countNumber);
         int number = scanner.nextInt();
         //scanner.nextLine();
         totalSum += number;
         countNumber++;
        }
        System.out.println("Total sum is: " + totalSum);
       }else{
        System.out.println("Invalid number");
       }
       scanner.close();
    }
}