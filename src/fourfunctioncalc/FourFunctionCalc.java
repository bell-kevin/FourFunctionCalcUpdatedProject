package fourfunctioncalc;

/******************************************************************************
* FourFunctionCalc.java 
* Programmer: @author jcboyd
* Version: 2.0
* Course: SDEV 2210
* This program is designed to add, subtract, multiply, and divide 2 numbers
* supplied by the user with unit testing using test runners and a test suite
******************************************************************************/

import java.util.*; //Scanner

public class FourFunctionCalc {
    
    public static void main(String[] args) {
       
        Scanner stdIn = new Scanner(System.in);
        double num1, num2; //user input
        String addResult, subtractResult, 
                multiplyResult, divideResult; //answers converted to strings

        System.out.println("Calculator Functions by JC Boyd\n");
        //input loop to validate user entry in range
        do {        
            System.out.print("Enter first number: ");        
            num1 = Double.parseDouble(stdIn.nextLine());
            System.out.print("Enter second number: ");        
            num2 = Double.parseDouble(stdIn.nextLine());
        } while (num1 < -99.99 | num1 > 99.99 | num2 < -99.99
                | num2 > 99.99 | num2 == 0);
        
        //call overloaded method, results from input of integers or one or doubles
        if (((int) num1 != num1) | ((int) num2 != num2)) {
            addResult = String.format("%.2f", add(num1, num2));
            subtractResult = String.format("%.2f", subtract(num1, num2));
            multiplyResult = String.format("%.2f", multiply(num1, num2));
            divideResult = String.format("%.2f", divide(num1, num2));
        }
        else {
            addResult = Integer.toString(add((int) num1, (int) num2));
            subtractResult = Integer.toString(subtract((int) num1, (int) num2));
            multiplyResult = Integer.toString(multiply((int) num1, (int) num2));
            divideResult = Integer.toString(divide((int) num1, (int) num2));
        } //end if

        //display results using formatted strings
        display(addResult, subtractResult, multiplyResult, divideResult);
        
    } //end main
    
    public static int add(int num1, int num2) {                 //integer addition
        return num1 + num2;
    } //end add
    
    public static int subtract(int num1, int num2) {            //integer subtraction
        return num1 - num2;
    } //end subtract
    
    public static int multiply(int num1, int num2) {            //integer multiplication
        return num1 * num2;
    } //end multiply
    
    public static int divide(int num1, int num2) {              //integer division
        return num1 / num2; 
    } //end divide
    
    public static double add(double num1, double num2) {        //double addition
        return num1 + num2;
    } //end add
    
    public static double subtract(double num1, double num2) {   //double subtraction
        return num1 - num2;
    } //end subtract
    
    public static double multiply(double num1, double num2) {   //double multiplication
        return num1 * num2;
    } //end multiply
    
    public static double divide(double num1, double num2) {     //double division
        return num1 / num2; 
    } //end divide
    
    public static void display(String addResult, String subtractResult, 
            String multiplyResult, String divideResult) {
        System.out.printf("%24s = %s\n", "Result of addition", addResult);
        System.out.printf("%24s = %s\n", "Result of subtraction", subtractResult);
        System.out.printf("%24s = %s\n", "Result of multiplication", multiplyResult);
        System.out.printf("%24s = %s\n", "Result of division", divideResult);
    } //end display
      
} //end class FourFunctionCalc

