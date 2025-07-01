import com.sun.javafx.image.impl.IntArgb;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        /*//Ex1

        String[] words = { "cat", "dog", "red", "isss", "am" };
        int longest = 0;
        for(String word : words){
            if(word.length() > longest){
                longest = word.length();
            }
        }
        boolean flag = true;
        for(int i = 0; i < words.length; i++){
            if(words[i].length() == longest){
                if(flag) {
                    System.out.print("\""+words[i]+"\"");
                    flag = false;
                }
                else {
                System.out.print(","+"\""+words[i]+"\"");}
            }
        }*/

   /*     //Ex2

        int[] numbers = {1, 1, 1, 3, 3, 5};
        Scanner input = new Scanner(System.in);
        loop:
        while (true) {
            System.out.print("Enter a number to check it's occurrences: ");
            int target = input.nextInt();
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == target) {
                    count++;
                }
            }
            if (count != 1) {
                System.out.println(target + " occurs " + count + " times ");
            } else {
                System.out.println(target + " occurs " + count + " time ");
            }
            while (true) {
                System.out.print("Do you want to continue (1 for YES / 2 for NO): ");
                int choice = input.nextInt();

                if (choice == 2) {
                    break loop;
                } else if (choice == 1) {
                    break;
                } else {
                    System.out.print("invalid input");
                }
            }

        }
*/

       /* //Ex3

        Scanner input = new Scanner(System.in);
        int[] numbers = {1, 4, 17, 7, 25, 3, 100};
        System.out.println("Enter the number of large elements: ");
        int k = input.nextInt();
        int[] biggest = new int[k];
        for (int i = 0; i < numbers.length; i++) {
            int smallest = 0;
            for (int j = 0; j < biggest.length; j++) {
                if (biggest[smallest] > biggest[j]){
                    smallest = j;
                }
            }
            if(biggest[smallest] < numbers[i]){
                biggest[smallest] = numbers[i];
            }

        }
        System.out.println( k + " largest elements of the said array are: \n"+ Arrays.toString(biggest));
*/

        /*//Ex4

        int[] numbers = {6,5,4,3,2,1};
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));

*/

        /*//Ex5
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        System.out.println("---------------------------------------------");
        loop:
        while (true){

            System.out.println("1. Accept elements of an array\n" +
                    "2. Display elements of an array\n" +
                    "3. Search the element within array\n" +
                    "4. Sort the array \n" +
                    "5. To Stop " );
            System.out.println("---------------------------------------------");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    accept(numbers);
                    break;
                case 2:
                    System.out.println("The elements are: ");
                    display(numbers);
                    break;
                case 3:
                    System.out.println("enter an element to search for: ");
                    int target = input.nextInt();
                    if(search(numbers,target)){
                        System.out.println(target + " exists in the array");
                    }
                    else{
                        System.out.println(target + " does NOT exists in the array");
                    }
                    break;
                case 4:
                    numbers = sort(numbers);
                    System.out.println("The array after sorting: ");
                    display(numbers);
                    break;
                case 5:
                    System.out.println("*** Bye!!");
                    break loop;

                default:
                    System.out.println("Invalid input!! ");
                    break;
            }
            System.out.println("---------------------------------------------");

        }*/


        /*//Ex6

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minimum value of the range: ");
        int min = input.nextInt();
        System.out.println("Enter the maximum value of the range: ");
        int max = input.nextInt();
        System.out.println("Enter the number of random numbers to generate: ");
        int number = input.nextInt();
        int[] randoms = new int[number];
        for (int i=0; i<randoms.length;i++){
            randoms[i] =  random(min,max);
        }
        System.out.println("Random numbers within the specified range: ");
        System.out.println(Arrays.toString(randoms));*/


      /*  //Ex7

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = input.nextLine();
        int totalScore = 0;
        totalScore = checkLength(password) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
        if(totalScore >= 8){
            System.out.println("Password is strong");
        } else if (totalScore >= 5) {
            System.out.println("Password is moderately strong");
        }
        else {
            System.out.println("Password is weak");
        }*/

        //Ex8


       /* Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int number = input.nextInt();
        ArrayList<Integer> seq = fibonacci(number);
        if (number > 0){
            System.out.println("Fibonacci sequence with "+ number +" terms: ");
            System.out.println(seq);
        }
        else {
            System.out.println("invalid input!");
            }
*/






    }

    //Ex4
    public static int[] reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    //Ex5
    public static int[] accept(int[] arr){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++){
            System.out.println("Enter the "+ (i+1) + "th element:");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr){
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length ; i++){
            System.out.print(", " + arr[i]);
        }
        System.out.println();
    }

    public static boolean search(int[] arr, int target){
        boolean result = false;
        for (int i = 0; i < arr.length ; i++){
            if (arr[i] == target){
                result = true;
            }
        }
        return result;
    }

    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length ; i++){
            for (int j = i+1; j< arr.length ;j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }



    //Ex6
    public static int random(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }


    //Ex7

    public static int checkLength(String password){

        if(password.length() <= 5){
            return 0;
        } else if (password.length() <= 7) {
            return 2;
        } else  {
            return 3;
        }
    }


    public static int checkSpecialCharacters(String password){
            Pattern regex = Pattern.compile("[!@#$%]");
            Matcher match = regex.matcher(password);
            if (match.find()){
                return 2;
            }
        return 0;
    }


    public static int checkUpperCaseLowerCase(String password){
        Pattern upCase = Pattern.compile("[a-z]");
        Pattern lowCase = Pattern.compile("[A-Z]");
        Matcher low = lowCase.matcher(password);
        Matcher up = upCase.matcher(password);

        if (low.find() && up.find()){
            return 3;
        }
        return 0;
    }

    //Ex8
    public static ArrayList<Integer> fibonacci(int number){
        ArrayList<Integer> seq = new ArrayList<>();
        if (number > 0)
            seq.add(0);
        if (number > 1){
            seq.add(1);
        }
        if (number > 2){
            for (int i=2; i < number; i++){
                seq.add(seq.get(i-1) + seq.get(i-2));
            }
        }
        return seq;
    }


}