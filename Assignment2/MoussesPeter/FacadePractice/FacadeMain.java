/**
 * Peter Mousses
 * CSE 360: Assignment 2
 * Template file for starting the Facade practice program
 */

 public class FacadeMain {

    public static void main( String[] args ) {

        /*****
         * Add 10 random numbers between [0, 10) to the numberList
         *****/
        int numberList[] = new int[10];
        for( int i = 0; i < 10; ++i ) {
            numberList[i] = ((int)(Math.random() * 10));
        }

        /*****
         * TODO: Go through the numberList, printing each number.
         *****/
         System.out.println("Initial 10 numbers in the numberList");
         for (int i : numberList) {
                 System.out.println(i);
         }

        /*****
         * TODO: Add/edit code as necessary to create a facade class that will complete each of the following:
         * - Add all the numbers together and print the result
         * - Subtract all the numbers from 100 and print the result
         * - Multiple all the numbers together and print the result
         *****/
        NumberFacade numberFacade = new NumberFacade();
        numberFacade.setNumbersList( numberList );

        /**
         * TODO: The function should print the message:
         * "********** Add all the numbers together ***********"
         * to make it easier to understand the output.
         **/
        numberFacade.addNumbers();

        /**
         * TODO: The function should print the message:
         * "********** Subtract all the numbers from 100 ***********"
         * to make it easier to understand the output.
         **/
        numberFacade.subtractNumbers();

        /**
         * TODO: The function should print the message:
         * "********** Multiply all the numbers together ***********"
         * to make it easier to understand the output.
         **/
        numberFacade.multiplyNumbers();

    }
 }

 class NumberFacade {
         int numberList[] = new int[10];
         void setNumbersList(int list[]) {
                 numberList = list;
         }
         void addNumbers() {
                 System.out.println("********** Add all the numbers together ***********");
                 int count = 0;
                 for (int i : numberList) {
                         count+=i;
                 }
                 System.out.println(count);
         }
         void subtractNumbers() {
                 System.out.println("********** Subtract all the numbers from 100 ***********");
                 int sum = 0;
                 for (int i : numberList) {
                         sum+=i;
                 }
                 System.out.println(sum - 100);
         }
         void multiplyNumbers() {
                 System.out.println("********** Multiply all the numbers together ***********");
                 int mult = 1;
                 for (int i : numberList) {
                         mult *= i;
                 }
                 System.out.println(mult);
         }
 }
