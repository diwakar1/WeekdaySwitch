package com.company;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String weekString;
        Scanner input = new Scanner(System.in);

        boolean askagain = true;
        while (askagain) {
            System.out.println(" please, enter Week day number from 1 to 7 ");
            int weekDay = input.nextInt();

            {

                switch (weekDay) {

                    case 1: {
                        weekString = "Sunday";
                        System.out.println(weekString);
                        break;
                    }
                    case 2: {
                        weekString = "Monday";
                        System.out.println(weekString);
                        break;
                    }
                    case 3: {
                        weekString = "Tuesday";
                        System.out.println(weekString);
                        break;
                    }
                    case 4: {
                        weekString = "Wednesday";
                        System.out.println(weekString);
                        break;
                    }
                    case 5: {
                        weekString = "Thursday";
                        System.out.println(weekString);
                        break;
                    }
                    case 6: {
                        weekString = "Friday";
                        System.out.println(weekString);
                        break;
                    }
                    case 7: {
                        weekString = "Saturday";
                        System.out.println(weekString);
                        break;
                    }

                    default:
                        askagain=false;
                }




            }

        }
        System.out.println("you entered wrong number");
    }
}

