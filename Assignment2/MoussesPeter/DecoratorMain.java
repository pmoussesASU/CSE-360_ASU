/**
 * Peter Mousses
 * CSE 360: Assignment 2
 * Template file for starting the Decorator practice program
 */
 interface NumberList {
        public int[] array = new int[11];
        public int operate();
 }
class Decorator implements NumberList {
        protected NumberList numberList;

        public Decorator(NumberList n) {
                this.numberList = n;
        }

        @Override
        public int operate() {
                return this.numberList.operate();
        }
}

class add extends Decorator {
        @Override
        public operate(Numberlist n) {
                super(n);
        }

        @Override
        public int operate() {
                int sum = 0;
                for (int i : super.numberList.array) {
                        sum+=i;
                }
                return sum;
        }

}
 public class DecoratorMain {

    public static void main( String[] args ) {

            /*****
             * TODO: Add 10 random numbers between [0, 10) to a numberList
             * TODO: Go through the numberList, printing each number.
             *****/
            int[] numberList = new int[5];
            System.out.println("Initial 5 numbers in the numberList");
            for (int i = 0; i < numberList.length; i++) {
                    numberList[i] = (int)(Math.random() * 10);
                    System.out.println(numberList[i]);
            }

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
