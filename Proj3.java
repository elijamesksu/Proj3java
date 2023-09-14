/*
Eli james cis 200 Section b
Date completed 9/12/2023
Proj3
Description:
Write a program that asks the user for two (x, y) coordinates then calculates and
displays the equation between the coordinates in slope-intercept form. You will then plot the two points on a graph
The program will repeat until user chooses to quit. Accept either upper or lowercase ‘Y’ and ‘N’.
* The program will create a NEW graph for each and require the user to enter NEW points for each
execution. You are simply repeating the display shown above without the user having to re-run the
program each time.
• Round both the slope and y-intercept to two decimal places when displaying.
• Use nested loops to plot the two points. You may need to add extra if-statements for displaying the
x-axis and y-axis.
• If you have two points (x1, y1) and (x2, y2), the slope is defined as: (y2-y1) / (x2-x1)
Then, using the slope and one of the points, the y-intercept is defined as: y1 – slope*x1
• Display the line in slope-intercept form as shown in the example: y = slope*x + y-intercept
Include the following Data validation: Display a unique (specific) error message as shown in the
example above and loop until user enters in valid data if the user does any of the 3 items listed below. By
unique, one generic error messages must not be used (such as “error occurred”) but must be specific to
the error that occurred. (Again, use the messages shown above).
1) enters coordinates that are not between (0,0) and (9,9)
2) if the slope between the two points is undefined
3) enters the same point twice
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Proj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner to collect user input
        double x1, x2, y1, y2;//declaring variables as doubles
        char userInput = 'Y'; // char for input at the end of program to run it again

        while (userInput == 'Y' || userInput == 'y') { // main while loop
                System.out.print("Enter x1: "); //x1 coordinate
                x1 = sc.nextDouble();//scanning input as double
                System.out.print("Enter y1: ");//y1 coordinate
                y1 = sc.nextDouble();//scanning input as double
                System.out.print("Enter x2: ");//x2 coordinate
                x2 = sc.nextDouble();//scanning input as double
                System.out.print("Enter y2: ");//y2 coordinate
                y2 = sc.nextDouble();//scanning input as double

                while(x1 == x2 && y1 == y2) { // while loop checking user input for errors
                    System.out.println("Point values must be different.");//displayed error message
                    System.out.println();//spacer
                    System.out.print("Re-enter x1: ");//prompt to enter input again
                    x1 = sc.nextDouble();//scanning input as a double
                    System.out.print("Re-enter y1: ");//prompt to enter input again
                    y1 = sc.nextDouble();//scanning input as a double
                    System.out.print("Re-enter x2: ");//prompt to enter input again
                    x2 = sc.nextDouble();//scanning input as a double
                    System.out.print("Re-enter y2: ");//prompt to enter input again
                    y2 = sc.nextDouble();//scanning input as a double
                }
                while (x1 == x2) { // while loop checking user input for errors
                        System.out.println("Line between points must have a slope");// displayed error message
                        System.out.println("(i.e. x1 and x2 must differ)");// displayed error message
                        System.out.println();//spacer
                        System.out.print("Re-enter x1: ");//prompt to enter input again
                        x1 = sc.nextDouble();//scanning input as double
                        System.out.print("Re-enter y1: ");//prompt to enter input again
                        y1 = sc.nextDouble();//scanning input as double
                        System.out.print("Re-enter x2: ");//prompt to enter input again
                        x2 = sc.nextDouble();//scanning input as double
                        System.out.print("Re-enter y2: ");//prompt to enter input again
                        y2 = sc.nextDouble(); //scanning input as double

                }

                while(x1 > 9 || x1 < 0 || x2 > 9 || x2 < 0 || y1 > 9 || y1 < 0 || y2 > 9 || y2 < 0) {// w
                    System.out.println("All points must be in between (0,0) and (9,9).");
                    System.out.println();
                    System.out.print("Re-enter x1: ");
                    x1 = sc.nextDouble();
                    System.out.print("Re-enter y1: ");
                    y1 = sc.nextDouble();
                    System.out.print("Re-enter x2: ");
                    x2 = sc.nextDouble();
                    System.out.print("Re-enter y2: ");
                    y2 = sc.nextDouble();
                    if ( x1 == x2){
                        System.out.println("Line between points must have a slope");
                        System.out.println("(i.e. x1 and x2 must differ)");
                        System.out.println();
                        System.out.print("Re-enter x1: ");
                        x1 = sc.nextDouble();
                        System.out.print("Re-enter y1: ");
                        y1 = sc.nextDouble();
                        System.out.print("Re-enter x2: ");
                        x2 = sc.nextDouble();
                        System.out.print("Re-enter y2: ");
                        y2 = sc.nextDouble();
                    }

                }
                double slope = (y2 - y1) / (x2 - x1);
                DecimalFormat df = new DecimalFormat("#,###.##");
                DecimalFormat dd = new DecimalFormat("#,###.00");
                double yIntercept = y1 - slope * x1;

                System.out.println("y = " + df.format(slope) + "x + " + dd.format(yIntercept));


                for (int row = 9; row >= 0; row--) {
                    if (row > 0) {
                        if (x1 == 0 && y1 == 1 && row == 1) {
                            System.out.print("1 *");

                        } else if (x1 == 0 && y1 == 2 && row == 2) {
                            System.out.print("2 *");

                        } else if (x1 == 0 && y1 == 3 && row == 3) {
                            System.out.print("3 *");

                        } else if (x1 == 0 && y1 == 4 && row == 4) {
                            System.out.print("4 *");

                        } else if (x1 == 0 && y1 == 5 && row == 5) {
                            System.out.print("5 *");

                        } else if (x1 == 0 && y1 == 6 && row == 6) {
                            System.out.print("6 *");

                        } else if (x1 == 0 && y1 == 7 && row == 7) {
                            System.out.print("7 *");

                        } else if (x1 == 0 && y1 == 8 && row == 8) {
                            System.out.print("8 *");

                        } else if (x1 == 0 && y1 == 9 && row == 9) {
                            System.out.print("9 *");

                        }else if (x2 == 0 && y2 == 1 && row == 1) {
                            System.out.print("1 *");

                        } else if (x2 == 0 && y2 == 2 && row == 2) {
                            System.out.print("2 *");

                        } else if (x2 == 0 && y2 == 3 && row == 3) {
                            System.out.print("3 *");

                        } else if (x2 == 0 && y2 == 4 && row == 4) {
                            System.out.print("4 *");

                        } else if (x2 == 0 && y2 == 5 && row == 5) {
                            System.out.print("5 *");

                        } else if (x2 == 0 && y2 == 6 && row == 6) {
                            System.out.print("6 *");

                        } else if (x2 == 0 && y2 == 7 && row == 7) {
                            System.out.print("7 *");

                        } else if (x2 == 0 && y2 == 8 && row == 8) {
                            System.out.print("8 *");

                        } else if (x2 == 0 && y2 == 9 && row == 9) {
                            System.out.print("9 *");

                        }
                        else {
                            System.out.print(row + " |");
                        }
                    }
                    if (row == 0) {
                        System.out.print("0 ");

                    }

                    if (x1 == 0 && y1 == 0 && row == 0) {
                        System.out.print("*");
                        System.out.print(" _________________");
                    }
                    if (x2 == 0 && y2 == 0 && row == 0) {
                        System.out.print("*");
                        System.out.print(" _________________");
                    }

                    if (x2 != 0 && x2 < 9 && y2 != 0 && y2 < 9 && x1 != 0 && x1 < 9 && y1 != 0 && y1 < 9 && row == 0) {
                        System.out.print(" _________________");

                     }
                    if (x2 == 9 && y2 !=0 && x1 < 9 && x1 !=0 && y1 != 0 && row == 0) {
                        System.out.print(" __________________");

                    }
                    if(y1 == 9 && x1 !=0 && x2!= 0 && row == 0 ) {
                        System.out.print(" __________________");
                    }
                    if(y2 == 9 && x1 !=0 && x2!= 0 && row == 0 ) {
                        System.out.print(" __________________");
                    }

                    if (x1 == 1 && y1 == 0 && row == 0) {

                        System.out.print(" _*_______________");
                    }
                    if (x1 == 2 && y1 == 0 && row == 0) {

                        System.out.print(" ___*_____________");
                    }
                    if (x1 == 3 && y1 == 0 && row == 0) {

                        System.out.print(" _____*___________");
                    }
                    if (x1 == 4 && y1 == 0 && row == 0) {

                        System.out.print(" _______*_________");
                    }
                    if (x1 == 5 && y1 == 0 && row == 0) {

                        System.out.print(" _________*_______");
                    }
                    if (x1 == 6 && y1 == 0 && row == 0) {

                        System.out.print(" ___________*_____");
                    }
                    if (x1 == 7 && y1 == 0 && row == 0) {

                        System.out.print(" _____________*___");
                    }
                    if (x1 == 8 && y1 == 0 && row == 0) {

                        System.out.print(" _______________*_");
                    }
                    if (x1 == 9 && y1 == 0 && row == 0) {

                        System.out.print(" _________________*");
                    }
                    if (x2 == 1 && y2 == 0 && row == 0) {

                        System.out.print(" _*_______________");
                    }
                    if (x2 == 2 && y2 == 0 && row == 0) {

                        System.out.print(" ___*_____________");
                    }
                    if (x2 == 3 && y2 == 0 && row == 0) {

                        System.out.print(" _____*___________");
                    }
                    if (x2 == 4 && y2 == 0 && row == 0) {

                        System.out.print(" _______*_________");
                    }
                    if (x2 == 5 && y2 == 0 && row == 0) {

                        System.out.print(" _________*_______");
                    }
                    if (x2 == 6 && y2 == 0 && row == 0) {

                        System.out.print(" ___________*_____");
                    }
                    if (x2 == 7 && y2 == 0 && row == 0) {

                        System.out.print(" _____________*___");
                    }
                    if (x2 == 8 && y2 == 0 && row == 0) {

                        System.out.print(" _______________*_");
                    }
                    if (x2 == 9 && y2 == 0 && row == 0) {
                        System.out.print(" _________________*");
                    }
                    if (x1 == 9 && y1 != 0 && x2 != 0 && y2 != 0 && row == 0){
                        System.out.print(" __________________");
                    }
                    if( x1 == 9 && y1 != 0 && x2 == 0 && y2 != 0 && row == 0){
                        System.out.print(" __________________");
                    }
                    if(x2 == 0 && y2 != 0 && x1 != 9 && y1 != 0 && row == 0 ){
                      System.out.print(" _________________");
                    }
                    if(x1 == 0 && y1 != 0 && y2 != 0 && x2 !=0 && x2 < 9 && row == 0){
                        System.out.print(" _________________");
                    }
                    if(x1 == 0 && y1 != 0 && y2 != 0  && x2 == 9 && row == 0){
                        System.out.print(" __________________");
                    }



                    for (int col = 1; col <= 9; col++) {
                        if ((row != 0 && col == x1 && row == y1) || (col == x2 && row == y2 && y2 != 0)) {
                            System.out.print("* ");
                        }
                        if (col == 1) {
                            System.out.print(" ");
                        }
                        if (col == 0) {
                            System.out.println(" ");
                        }
                        else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println(" ");
                }


                System.out.println("  0 1 2 3 4 5 6 7 8 9");
                System.out.println();
                System.out.print("Run this program again? (y/n)");
                userInput = sc.next().charAt(0);
                System.out.println();

            }
        }
    }