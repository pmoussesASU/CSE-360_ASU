/**
 * Peter Mousses
 * CSE 360: Assignment 2
 * Template file for starting the Iterator practice program
 */
 import java.util.ArrayList;
class NumberList {
        ArrayList<Integer> list = new ArrayList<Integer>();
        NumberList() {}
        void addNumber(int i) {
                list.add(i);
        }
        ArrayList<Integer> getList() {
                return list;
        }
}
class NumberIterator extends NumberList {
        ArrayList<Integer> list = new ArrayList<Integer>();
        NumberIterator(ArrayList<Integer> l) {
                list = l;
        }
        boolean hasNext() {
                if ( list.hasNext() ) return true;
                else return false;
        }
}
 public class IteratorMain {

    public static void main( String[] args ) {

        /*****
         * Add 10 random numbers between [0, 1000) to the numberList
         *****/
        NumberList numberList = new NumberList();
        for( int i = 0; i < 10; ++i ) {
            numberList.addNumber(((int)(Math.random() * 1000)));
        }

        /*****
         * TODO: Create an iterator to go through the numberList and print each number.
         * If a number is greater than 500, remove it from the list.
         *****/
        NumberIterator iterator = new NumberIterator(numberList.getList());
        System.out.println("Initial 10 numbers in the numberList");
        for (int i = 0; i < iterator.list.size(); i++) {
                
        }

        System.out.println("********** Removed numbers greater than 500 ***********");

        /*****
         * TODO: Go through the numberList again and print each number.
         *****/
         System.out.println("Numbers that are now in the numberList");
         while( iterator.hasNext() ) {
             // print number
         }
    }
 }
