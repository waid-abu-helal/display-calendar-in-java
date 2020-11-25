package aaaa;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        String Months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int numday[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner in = new Scanner(System.in);
        System.out.println("enter the year");
        int year = in.nextInt();
        if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))) {
            numday[1] = 29;
        }
        System.out.println("enter the day start the year ");
        int day = in.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println("\t" + Months[i - 1]+" "+ year);
            System.out.println("ـــــــــــــــــــــــــ");
            System.out.printf("%-4s%-4s%-4s%-4s%-4s%-4s%-4s\n","Sun","Mon","Tue","Wed","Thu","Fri","Sat");
            day = manh(day, numday[i - 1]);
        }

    }

    public static int manh(int day, int numday) {
        int a[][] = new int[6][7];
        int counter = 1;
        int j = 0;
        for (int i = 0; i < 6; i++) {
            for (j = day; j < 7; j++) {
                a[i][j] = counter;
                day++;
                counter++;
                if (counter == numday + 1) {
                    break;
                }
            }
            day = 0;
            if (counter == numday + 1) {
                break;
            }

        }
        for (int i = 0; i < 6; i++) {
            for (int f = 0; f < 7; f++) {
                System.out.printf("%-4s", a[i][f] == 0 ? "" : a[i][f]);
            }
            System.out.println();

        }
        int dayret = j + 1;
        return dayret >= 7 ? 0 : dayret;
    }

}
