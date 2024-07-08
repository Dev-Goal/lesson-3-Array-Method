package Practice.Practice_12_Find_Value_Array;

import java.util.Scanner;

public class Find_Value_Array {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Coconut", "Orange", "Pear", "Avocado", "Cherry", "Kiwi", "Mango", "Lemon"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fruit: ");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < fruits.length; i++) {
            if(fruits[i].equals(name)) {
                System.out.println("Position of the fruits in the list " + name + " is " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Not found " + name + " in the list");
        }
    }
}
