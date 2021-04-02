/**
 * Peter Mousses
 * CSE 360: Assignment 2
 * Template file for starting the Decorator practice program
 */
 interface NumberList {
        public int[] array = new int[11];
        public int performNumberOperatation();
 }
class Decorator implements NumberList {
        protected NumberList numberList;

        public Decorator(NumberList n) {
                this.numberList = n;
        }

        @Override
        public int performNumberOperatation() {
                return this.numberList.performNumberOperatation();
        }
}

class add extends Decorator {
        @Override
        public int performNumberOperatation() {
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
/*
interface Dress {
  public void assemble();
}

class BasicDress implements Dress {
  @Override
  public void assemble() {
    System.out.println("Basic Dress Features");
  }
}

class DressDecorator implements Dress {
  protected Dress dress;

  public DressDecorator(Dress c) {
    this.dress = c;
  }

  @Override
  public void assemble() {
    this.dress.assemble();
  }
}

class CasualDress extends DressDecorator {
  public CasualDress(Dress c) {
    super(c);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding Casual Dress Features");
  }
}


class SportyDress extends DressDecorator {
  public SportyDress(Dress c) {
    super(c);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding Sporty Dress Features");
  }
}

class FancyDress extends DressDecorator {
  public FancyDress(Dress c) {
    super(c);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding Fancy Dress Features");
  }
}

public class DecoratorMain {

  public static void main(String[] args) {

    Dress sportyDress = new SportyDress(new BasicDress());
    sportyDress.assemble();
    System.out.println();

    Dress fancyDress = new FancyDress(new BasicDress());
    fancyDress.assemble();
    System.out.println();

    Dress casualDress = new CasualDress(new BasicDress());
    casualDress.assemble();
    System.out.println();


    Dress sportyFancyDress = new SportyDress(new FancyDress(new BasicDress()));
    sportyFancyDress.assemble();
    System.out.println();

    Dress casualFancyDress = new CasualDress(new FancyDress(new BasicDress()));
    casualFancyDress.assemble();

  }
}
*/
