import java.util.Random;
public class Big_And_Small_Numbers {
    public static void main(String[] args) {

        int collectionSize = 10 , i = 1;
        int number , min = 101, max = 0;


        System.out.println("The Program draws " + collectionSize + "Integers numbers from 1 to 100" );
        System.out.println("and fins the smallest  and greatest of them");

        Random t = new Random();
        System.out.println(" Drawn: ");


        while (i <= collectionSize){
            number = Math.round((t.nextInt(100)+1));
            System.out.print(number + ", " );

            if (number < min) min =number;
            if (number >max) max = number;

            i++;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("The Biggest number in the collections is: " + max);
        System.out.println("And the smallest number in the set is: " + min);


    }
}

