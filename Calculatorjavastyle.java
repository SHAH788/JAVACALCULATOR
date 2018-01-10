import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculatorjavastyle 
{

    public static void main(String[] args) 
    {
        int VAL1;
        int VAL2;
    
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number");
        VAL1 = input.nextInt();

        System.out.println("please enter the second number");
        VAL2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println(" enter operation");
        operation = op.next();

        if (operation == "+");
        {
            System.out.println("your answer is" + (VAL1 + VAL2));
        }
        if  (operation == "-");
        {
            System.out.println("your answer is" + (VAL1 - VAL2));
            
        }
        if(operation=="--");
        {
         System.out.println("your answer is" + (VAL1 +- VAL2)); 
            
        }

        if (operation == "/");
        {
            System.out.println("your answer is" + (VAL1 / VAL2));
        }
        if (operation == "*")
        {
            System.out.println("your answer is" + (VAL1 * VAL2));
        }
if (operation == "^");
{
            System.out.println("your answer is" + (VAL1  *VAL1 *VAL2/1*VAL1-(VAL1*4)));
        }
if (operation == "%");
{
            System.out.println("your answer is" + (VAL1 %  VAL2));
        }

    }

}