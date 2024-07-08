package Practice.Practice_13_Find_Max_Value;

import java.util.Scanner;

public class Find_Max_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        double[] array;
        do{
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while(size > 20);
        array = new double[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter elemant " + (i + 1) + " is: ");
            array[i] = scanner.nextDouble();
        }
        System.out.print("Element in list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[0]){
                max = array[i];
            }
        }
        System.out.print("Max value in list " + " is: " + max);
    }
}
