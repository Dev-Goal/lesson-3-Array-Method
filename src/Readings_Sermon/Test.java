package Readings_Sermon;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Nhập các phân tử trong mảng: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Phần tử [" + i +"][" + j + "]:");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng: " + Arrays.deepToString(matrix));
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
