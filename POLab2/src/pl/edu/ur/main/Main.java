package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
        
        public static void xd (){
        Scanner load = new Scanner(System.in);
        int number_exercise;
        while (true) {
            System.out.println("Enter the task number from 1 to 4!\n");
            number_exercise = load.nextInt();
            switch (number_exercise) {

                case 1:
                    System.out.println("Exercise 3!");
                    System.out.println("Give me 10 numbers :");
                    int table2[] = new int[10];

                    for (int i = 0; i < 10; i++) {
                        table2[i] = load.nextInt();
                    }

                    for (int j = 0; j < 10; j++) {
                        System.out.println("Elements " + (j + 1) + " of the table :" + table2[j]);
                    }

                    System.out.println("\n");

                    for (int k = 9; k >= 0; k--) {
                        System.out.println("Elements " + (k + 1) + " of the table :" + table2[k]);
                    }

                    System.out.println("\n");

                    for (int l = 0; l < 10; l++) {
                        if (table2[l] % 2 == 1) {
                            System.out.println("Elements " + (l + 1) + " of the table :" + table2[l]);
                        }
                    }

                    System.out.println("\n");

                    for (int o = 0; o < 10; o++) {
                        if (table2[o] % 2 == 0) {
                            System.out.println("Elements " + (o + 1) + " of the table :" + table2[o]);
                        }
                    }

                    break;
                case 2:
                    System.out.println("Exercise 4!\n"
                            + "Please give me 10 numbers :");
                    int[] table3 = new int[10];
                    double result = 0,
                     result2 = 0;
                    for (int o = 0; o < 10; o++) {
                        table3[o] = load.nextInt();
                    }

                    for (int o = 0; o < 10; o++) {
                        result += +table3[o];
                    }
                    System.out.println("The sum of numbers from the array :" + result);
                    result = 1;

                    for (int o = 0; o < 10; o++) {
                        result += result * table3[o];
                    }
                    System.out.println("The quotient of numbers from the array :" + result);

                    for (int o = 0; o < 10; o++) {
                        result += table3[o];
                    }
                    System.out.println("The average of numbers from the array :" + (result / 10));

                    for (int o = 0; o < 10; o++) {
                        result = table3[0];
                        result2 = table3[0];
                        if (result < table3[o]) {
                            result = table3[o];
                        }
                        if (result2 > table3[o]) {
                            result2 = table3[o];
                        }
                    }
                    System.out.println("The biggest element :" + result + "\n"
                            + "The smallest element :" + result2);

                    break;

                case 3:
                    System.out.println("Exercise 6!\n"
                            + "Give please integer numbesr!");
                    int lion;
                    while (true) {
                        lion = load.nextInt();
                        if (lion < 0) {
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exercise 7!\n"
                            + "Provide a number of elements of board");
                    int dog,
                     i = 0;
                    dog = load.nextInt();
                    int idontknow[] = new int[dog];
                    while (i < dog) {
                        idontknow[i] = load.nextInt();
                        i++;
                    }

                    int temp;
                    int change = 1;
                    while (change > 0) {
                        change = 0;
                        for (int q = 0; q < idontknow.length; q++) {
                            if (idontknow[q] > idontknow[q + 1]) {
                                temp = idontknow[q + 1];
                                idontknow[q + 1] = idontknow[q];
                                idontknow[q] = temp;
                                change++;
                            }
                        }
                    }

                    for (int p = 0; p < idontknow.length; p++) {
                        System.out.println("Elements " + p + " of boards : " + idontknow[p] + "\n");
                    }

                    break;
                default:
                    System.out.println("Bad job number!");
                    break;
            }
        }

        }

}