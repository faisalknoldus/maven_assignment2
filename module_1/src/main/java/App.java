
import java.util.*;
public class App{

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter any Two Integers to Calculate Result :");
        int a = sc.nextInt();
        int b = sc.nextInt();




        System.out.print("\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Exit\n");
        System.out.println("\nEnter Your Choice: ");
// Using Switch case for giving choice
        int c = sc.nextInt();
        switch(c) {

            case 1:calc.add(a, b);
                break;
            case 2:calc.sub(a, b);
                break;
            case 3:calc.mul(a, b);
                break;
            case 4:calc.div(a, b);
                break;
            case 5:return ;

            default:
            { System.out.println("Please enter correct choice!");

                // Using Nested Switch for giving another chance to enter Correct Choice

                c = sc.nextInt();
                switch(c) {

                    case 1:calc.add(a, b);
                        break;
                    case 2:calc.sub(a, b);
                        break;
                    case 3:calc.mul(a, b);
                        break;
                    case 4:calc.div(a, b);
                        break;
                    case 5:return ;
                    default: System.out.println("Please enter correct choice!");


                }

            }


        }
    }
}
