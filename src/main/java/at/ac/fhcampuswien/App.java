package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    Scanner scan = new Scanner(System.in);

    //todo Task 1
    public void largestNumber() {
        double number;
        int count = 1;
        double max = 0;

        do {
            System.out.print("Number " + count + ": ");
            number = scan.nextFloat();
            //System.out.printf(); //das benutzen für die doubles


            if (count == 1 && number <= 0) {
                System.out.println("No number entered.");
                break;
            }
            if (number > max) {
                max = number;
            }

            if (number <= 0) {

                System.out.printf( "The largest number is "+ "%.2f", max);
                System.out.println();
            }

            count++;

        } while (number > 0);

    }

    //todo Task 2
    public void stairs() {
        int k = 1;
        System.out.print("n: ");
        int rows = scan.nextInt();

        if(rows <= 0){
            System.out.println("Invalid number!");
        } else{
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(k++ + " ");
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid() {
        int number = 6;

        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //todo Task 4
    public void printRhombus() {
        //character: char c = scan.next().charAt(0); //next - string, charAt (methode dieses Objekts), mit Index 0
        System.out.print("h: ");
        int h = scan.nextInt(); //height
        System.out.print("c: ");
        char c = scan.next().charAt(0); //char an der 0ten Stelle


        if(h%2 == 0) {
            System.out.println("Invalid number!");
        } else {

            for(int i = 1; i <= h/2 + 1 ; i++){
                for(int j = h/2 ; j >= i; j--){
                    System.out.print(" ");
                }
                for(int k = i; k > 0; k--){
                    System.out.print((char) (c-k+1));
                }
                for (int l = 1; l<i; l++){
                    System.out.print((char) (c - l));
                }
                System.out.println();
            }
           for(int i = h/2; i > 0; i--) {
               for(int j = h/2 ; j >= i; j--){
                   System.out.print(" ");
               }
               for(int k = i; k > 0; k--){
                   System.out.print((char) (c-k+1));
               }
               for (int l = 1; l<i; l++){
                   System.out.print((char) (c - l));
               }
               System.out.println();
           }
        }
    }

    //todo Task 5
    public void marks() {
        int sum = 0;
        int count5 = 0;
        int countNum = 1;
        boolean isInput = true;


        while (isInput) {
            System.out.print("Mark " +  countNum + ": ");
            int number = scan.nextInt();

            if (number > 0 && number <= 5) {
                sum = sum + number;
                countNum++;

                if (number == 5) {
                    count5++;
                }
            } else if(number < 0 || number > 5) {
                System.out.println("Invalid mark!");
            }

            if (number == 0) {
                float mean;// / i
                if (countNum == 1){
                    mean = (float) sum / (countNum);
                } else {
                    mean = (float) sum / (countNum - 1);
                }
                System.out.printf("Average: " + "%.2f", mean);
                System.out.println();
                System.out.println("Negative marks: " + count5);
                isInput = false;
            }
        }

    }

    //todo Task 6
    public void happyNumbers() {
        // unhappy zahlen: lange if Bedingung mit oder
        System.out.print("n: ");
        int number = scan.nextInt();
        int digit;
        int sum = 0;

        while(number !=1 && number !=4){
            while(number>0){
                digit = number % 10;
                sum = (digit*digit) + sum;
                number = number / 10;
            }
            number = sum;
            sum =0;
        }


        if (number == 1) {
            System.out.println("Happy number!");
        }else {
            System.out.println("Sad number!");
        }
    }



    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}