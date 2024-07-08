package Exercise.Exercise_16_Remove_Value;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        System.out.print("Nhập size: ");
        do{
            size = scanner.nextInt();
            if(size < 0){
                System.out.print("Nhập lại size: ");
            }
        }while (size < 0);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng đã tạo là: " + Arrays.toString(array));
        System.out.print("Nhập phần tử muốn xóa: ");
        int removeValue = scanner.nextInt();
        int count = 0;
        for (int value : array){
            if(value == removeValue){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Phần tử không có trong mảng");
        }else{
            int[] arrayNew = new int[array.length - count];
            for (int i = 0, k = 0; i < array.length; i++) {
                if (array[i] != removeValue){
                    arrayNew[k] = array[i];
                    k++;
                }
            }
            System.out.println("Mảng sau khi xóa phần tử: " + Arrays.toString(arrayNew));
        }
    }
}
