/**
 * Peter Mousses
 * CSE 360: Assignment 2
 * Template file for starting the Decorator practice program
 */

 public class DecoratorMain {

    public static void main( String[] args ) {

        /*****
         * TODO: Add 10 random numbers between [0, 10) to a numberList
         *****/


        /*****
         * TODO: Go through the numberList, printing each number.
         *****/
        System.out.println("Initial 5 numbers in the numberList");
        // put code implementation here

        /*****
         * TODO: Create three decorator classes
         * - One class will add all the numbers together and print the result in the format: ("Add operation result: " + result)
         * - One class will subtract all the numbers from 100 and then print the result in the format: ("Subtract operation result: " + result)
         * - One class will multiple all the numbers together and then print the result in the format: ("Multiply operation result: " + result)
         *****/
        NumberDecorator numberDecorator = new MultiplierOp(new SubtractOp(new AddOp()));
        numberDecorator.setNumbersList( numberList );

        numberDecorator.performNumberOperation();
    }
 }
