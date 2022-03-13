import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bmi_Index {
    public static void main(String[] args) throws IOException{

        float heightEmma , weightEmma, bmiEmma;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The Program will calculate your BMI");
        System.out.println("Enter your height in cm (and press Enter): ");
        heightEmma = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight in kg (and press Enter): ");
        weightEmma = Float.parseFloat(br.readLine());

        bmiEmma = (float) (weightEmma / (Math.pow(heightEmma, 2)));
        System.out.printf("Your BMI is: " + "%2.2f,  \n", bmiEmma);


        if (bmiEmma < 16){
            System.out.println("You are slim/skinny/suffering from starvation");
        } else if ((bmiEmma >= 16)&&(bmiEmma < 16.99)){
            System.out.println("You're emaciated");
        }else if ((bmiEmma >= 17)&&(bmiEmma < 18.49)){
            System.out.println("You're underweight");
        }else if ((bmiEmma >= 18.50)&&(bmiEmma < 22.99)){
            System.out.println("You're in a low range or the norm");
        }else if ((bmiEmma >= 23)&&(bmiEmma < 24.99)){
            System.out.println("You're in the high range of the norm");
        }else if ((bmiEmma >= 25)&&(bmiEmma < 27.49)){
            System.out.println("You're overweight ot pre-obese");
        }else if ((bmiEmma >= 27.50)&&(bmiEmma < 29.99)){
            System.out.println("You're overweight");
        }else if ((bmiEmma >= 30)&&(bmiEmma< 34.99)){
            System.out.println("You've 1st degree obesity");
        }else if ((bmiEmma >= 35)&&(bmiEmma < 39.99)){
            System.out.println("You've 2nd degree obesity");
        }else if ((bmiEmma > 40)){
            System.out.println("You've 3rd degree obesity");
        }

    }
}
