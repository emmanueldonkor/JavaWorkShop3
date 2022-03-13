import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import  static java.lang.Math.pow;
import  static java.lang.Math.sqrt;

public class ElementsOfEquationSquare {
    public static void main(String[] args) throws IOException{

        double a, b , c ,delta , x1 , x2;
        char rootsNumber=0;

        BufferedReader ts = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The program will calculate the roots of the equation ax^2+bx+c = 0. ");
        System.out.println("Input the value of a (and press Enter):");
        a = Double.parseDouble(ts.readLine());

        if (a == 0){
            System.out.println("Unauthorised value of the coefficient a.");
        }else{
            System.out.println("Input the value of b (and press Enter)");
            b = Double.parseDouble(ts.readLine());
            System.out.println("Input the value of c (and press Enter)");
            c = Double.parseDouble(ts.readLine());

            delta = pow(b,2)-4*a*c; //formula of delta being = b^2 - 4ac

            if (delta < 0) rootsNumber = 0 ;
            if (delta == 0) rootsNumber = 1;
            if (delta > 0) rootsNumber = 2;

            switch (rootsNumber){
                case 0:
                    System.out.println("There is no real roots"); break;
                case 1:{
                    x1 = -b/(2*a);
                    System.out.printf("For a = " + "%4.2f," ,a);
                    System.out.printf("b = " + "%4.2f, ", b);
                    System.out.printf("c = " + "4.2f," , c);
                    System.out.printf("the trinomial has one double root = ");
                    System.out.printf("%4.2f. \n", x1);
                }break;
                case 2:{
                    x1 = (-b-sqrt(delta))/(2*a);
                    x2 = (-b+sqrt(delta))/(2*a);
                    System.out.printf("For a = " + "%4.2f," ,a);
                    System.out.printf("b = " + "%4.2f, ", b);
                    System.out.printf("c = " + "4.2f. \n" , c);
                    System.out.print(" x1 = ");
                    System.out.printf("%4.2f. \n", x1);
                    System.out.print(" x2 = ");
                    System.out.printf("%4.2f. \n", x2);
                }break;
            }
        }

        //for a = 1, b = 5 , c = 4 the trinomial has two roots x1 = -4, x2 = -1
        //for a = 1, b = 4 , c = 4 the trinomial has one double x1 = -2

    }
}
