package Readings_Sermon;


import java.util.Scanner;

public class Sermon {
    public static int sum(int i1, int i2){
        int result = 0;
        for (int i = i1; i <= i2; i++) {
            if(i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum form 1 to 10: " + sum(1,10));
        System.out.println("Sum form 11 to 20: " + sum(11,20));
        System.out.println("Sum form 21 to 30: " + sum(21,30));
    }
}
