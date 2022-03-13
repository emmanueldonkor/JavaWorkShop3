public class EvenNumbers {
    public static void main(String[] args) {

        int number =100, i;
        System.out.println("we calculate the sum of even numbers from 1 to 100 .");

        for (i=1; i <=100 ; i++){
            if (i%2 == 0){
                number += i;//so number = number + i;
            }
        }

        System.out.println("The sum of even numbers from 1 to 100 is: " + number);



    }
}

