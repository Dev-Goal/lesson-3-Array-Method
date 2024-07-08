package Exercise.Exercise_17_Add_Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Add_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        System.out.print("Nhập size: ");
        do {
            size = scanner.nextInt();
            if (size < 0){
                System.out.println("Nhập lại size (size > 0): ");
            }
        }while (size < 0);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa tạo: " + Arrays.toString(array));
        System.out.print("Nhập phần tử muốn thêm: ");
        int addValue = scanner.nextInt();
        int[] arrayNew = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        arrayNew[arrayNew.length - 1] = addValue;
        array = arrayNew;
        System.out.println("Mảng sau khi thêm: " + Arrays.toString(array));
    }

}
