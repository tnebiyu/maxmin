
    import java.util.Scanner;

    public class Main {

        private static final Scanner SCANNER = new Scanner(System.in);

        public static void main(String[] args) {

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            System.out.println("===Min and max calculator===" +
                    "\nTo end the program enter a invalid number followed by enter." +
                    "\nEnter a number:");

            while (SCANNER.hasNextInt()) {
                System.out.println("Enter another number:");

                int input = SCANNER.nextInt();

                min = Math.min(input, min);
                max = Math.max(input, max);

                SCANNER.nextLine();
            }

            System.out.println("Results:" +
                    "\nMin = " + min +
                    "\nMax = " + max);

            SCANNER.close();
        }

}
