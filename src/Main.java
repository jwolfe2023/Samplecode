import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        int output = 0;

        int input1 = 0;

        int input2 = 0

//################################################# Start of the Program ###############################################

//      They are first greeted with this screen
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                                                +");
        System.out.println("+       1) Next Message                                          +");
        System.out.println("+                                                                +");
        System.out.println("+                                                                +");
        System.out.println("+                                                                +");
        System.out.println("+                                                                +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("> ");
        output = keyboard.nextInt();

//################################################## Start of Section 1 ################################################

            if (output == 1) {
//              When 1 is selected it will prompt you to edit input 1 or 2
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("+                                                                +");
                System.out.println("+       1) back                                                  +");
                System.out.println("+                                                                +");
                System.out.println("+                                                                +");
                System.out.println("+                                                                +");
                System.out.println("+                                                                +");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.print("> ");
                output = keyboard.nextInt();
//

                if (output == 1) {
//          When 1 is selected it will return back to the last message


                }
            }
        }
    }

