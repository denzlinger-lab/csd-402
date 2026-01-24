/* Abram Denzlinger
January 24, 2026
3.2 - Pyramid Assignment

This program uses nested loops to increment
by powers of 2, and applies formatting to
output in the shape of a pyramid.
 */

public class Main {
    public static void main(String[] args) {
        // Sets the pyramid height in rows
        int rows = 7;
        // Variable to control number spacing throughout the program
        int fieldWidth = 3;

        // String variable for spaces based on fieldWidth variable,
        // used for left/right padding
        String spaceBlock = String.format("%" + fieldWidth + "s", "");

        for (int i = 0; i < rows; i++) {

            // Left padding
            for (int space = 0; space < (rows - i - 1); space++) {
                System.out.print(spaceBlock);
            }

            // Ascending numbers, formatted by fieldWidth variable
            for (int j = 0; j <= i; j++) {
                System.out.printf("%" + fieldWidth + "d", (int)Math.pow(2, j));
            }

            // Descending numbers, formatted by fieldWidth variable
            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%" + fieldWidth + "d", (int)Math.pow(2, j));
            }

            // Right padding
            for (int space = 0; space < (rows - i - 1); space++) {
                System.out.print(spaceBlock);
            }

            System.out.println(" @");
        }
    }
}