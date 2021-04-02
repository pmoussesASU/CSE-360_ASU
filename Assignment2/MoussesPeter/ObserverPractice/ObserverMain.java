/**
 * Peter Mousses
 * CSE 360: Assignment 2
 * Template file for starting the Observer practice program
 */
class NumberFacade {
        public int[] numberList;
        public NumberFacade() {}
        public void setNumbersList(int[] n) {
                numberList = n;
        }
        public void printList() {
                for (int i = 0; i < numberList.length; i++) {
                        System.out.println(numberList[i]);
                }
        }
        public void updateList(int x) {
                int[] newList = new int[numberList.length + 1];
                for (int i = 0; i < numberList.length; i++) {
                        newList[i] = numberList[i];
                }
                newList[numberList.length] = x;
                setNumbersList(newList);
                System.out.println("********** numberList has been updated ***********");
                printList();
        }
        public void addNumbers() {
                int sum = 0;
                System.out.println("********** Add all the numbers together ***********");
                for (int i = 0; i < numberList.length; i++) {
                        sum += numberList[i];
                }
                updateList(sum);
        }
        public void subtractNumbers() {
                int sum = 0;
                System.out.println("********** Subtract all the numbers from 100 ***********");
                for (int i = 0; i < numberList.length; i++) {
                        sum += numberList[i];
                }
                updateList(sum-100);
        }
        public void multiplyNumbers() {
                int sum = 0;
                System.out.println("********** Multiply all the numbers together ***********");
                for (int i = 0; i < numberList.length; i++) {
                        sum *= numberList[i];
                }
                updateList(sum);
        }
}

class NumberObserver {
        public NumberFacade numberFacade;
        public NumberObserver(NumberFacade n) {
                numberFacade = n;
        }
}

 public class ObserverMain {

    public static void main( String[] args ) {

        /*****
         * TODO: Add 5 random numbers between [0, 10) to a numberList
         * TODO: Go through the numberList, printing each number.
         *****/
        int[] numberList = new int[5];
        System.out.println("Initial 5 numbers in the numberList");
        for (int i = 0; i < numberList.length; i++) {
                numberList[i] = (int)(Math.random() * 10);
                System.out.println(numberList[i]);
        }

        /*****
         * TODO: Add/edit code as necessary to create a class (or classes) that will complete each of the following:
         * - Add all the numbers together and then add the result to the numberList
         * - Subtract all the numbers from 100 and then add the result to the number list
         * - Multiple all the numbers together and then add the result to the number list
         *
         * Each time a new value is added to the numberList, the observer should print out the new list of numbers
         *****/
        NumberFacade numberFacade = new NumberFacade();
        numberFacade.setNumbersList( numberList );

        NumberObserver numberObserver = new NumberObserver( numberFacade );

        /**
         * TODO: Observer should print the message:
         * "********** numberList has been updated ***********"
         * to make it easier to understand the output.
         **/
        numberFacade.addNumbers();

        /**
         * TODO: Observer should print the message:
         * "********** numberList has been updated ***********"
         * to make it easier to understand the output.
         **/
        numberFacade.subtractNumbers();

        /**
         * TODO: Observer should print the message:
         * "********** numberList has been updated ***********"
         * to make it easier to understand the output.
         **/
        numberFacade.multiplyNumbers();

    }
 }
