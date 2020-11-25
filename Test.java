package aaaa;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.printf("%-10s\t%-10s\t%1s\t%-10s\t%-10s\n","Kilograms","Pounds","|","Kilograms","Pounds");
        for (int i = 1; i < 200; i++) {
            System.out.printf("%-10.0f\t%-10.1f\t%1s\t%-10.0f\t%-10.1f\n",((double)i),(i*2.2),"|",(17.5+i*2.5),((17.5+i*2.5)/2.2));
            i++;
        }
        
    }
}



