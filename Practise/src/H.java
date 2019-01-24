import java.util.InputMismatchException;
import java.util.Scanner;

class H{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res = 0;

        try {
            int n = in.nextInt();
            res = 10/n;
        }
        catch (ArithmeticException e){
            System.out.println("Value can't be zero");
        }
        catch (InputMismatchException e){
            System.out.println("Enter a valid number");
        }

        finally {
            System.out.println(res);
        }
    }

}