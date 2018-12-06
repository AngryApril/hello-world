package lesson01.part01.task10;

import java.util.Scanner;

/**
 * Created by alexey.valiev on 12/5/18.
 */
public class Solution {
    public static void main(String[] args) {

            System.out.println("Enter DAY:");
            int day = input();

            while(day < 1 || day > 31){
                System.out.println("DAY must be 'int' value between 1 and 31");
                System.out.println("Enter DAY:");
                day = input();

            }

            System.out.println("Enter MONTH:");
            int month = input();

            while (month < 1 || month > 12){
                System.out.println("MONTH must be 'int' value between 1 and 12 ");
                System.out.println("Enter MONTH:");
                month = input();

            }
        System.out.println("DAY: "+ day + "\nMONTH: " + month);

    }

    private static int input(){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        try{
            number = sc.nextInt();
        }catch (Exception e){
            System.out.println("Incorrect Data Input Type");
            return 0;
        }
        return number;
    }
}
