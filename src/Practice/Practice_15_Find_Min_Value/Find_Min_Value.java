package Practice.Practice_15_Find_Min_Value;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Min_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        System.out.print("Nhập size: ");
        size = scanner.nextInt();
        while (true){
            if(size > 0){
                break;
            }
        }
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng: " + Arrays.toString(array));
        int index = minValue(array);
        System.out.println("Giá trị nhỏ nhất: " + array[index]);
        System.out.println("Nằm vị trí index = " + index);
    }
    public static int minValue(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
