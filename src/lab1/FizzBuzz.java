package lab1;
// this is another comment to see if pulls works here as well
/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void second() {
        int i = 1;
        while (i < 200) {

            i = doFizzBuzz(i);
        }
    }

    public static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++;
        return i;
    }
}
