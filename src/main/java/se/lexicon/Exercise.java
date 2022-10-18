package se.lexicon;

import java.util.Arrays;

public class Exercise {


    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }

    // Ex1. Write a program which will store elements in an array of type ‘int’ and print it out.
    public static void ex1() {
        // Initialising an array
        int[] array = new int[]{11, 23, 39, 65, 78, 87};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Ex2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
    // If the element doesn’t exist your method should return -1 as value.
    public static void ex2() {
        System.out.println("\n" + "------------------");

        int[] numbers = {1, 3, 5, 7, 9, 11};
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 5);
        if (index < 0) {
            System.out.println("Data not found");
        } else {
            System.out.println("Index position of number " + numbers[index] + " is " + index);
        }
    }

    // Ex.3 Write a program which will sort string array.
    public static void ex3(){
        String[] cities = {"Paris", "London", "New York", "Stockholm"};
        //Arrays.sort(cities);
        Arrays.sort(cities, String.CASE_INSENSITIVE_ORDER);
        System.out.print("[");
        for (String city : cities) {
            System.out.print(city + ", ");
        }
        System.out.print("\b\b"); // Two backspaces --> Remove 2 characters backwards:(, )
        System.out.println("]");
    }

    // Ex4. Write a program which will copy the elements of one array into another array.
    public static void ex4(){
        int[] arrray = {1, 15, 20};
        int[] newArrray = Arrays.copyOf(arrray, arrray.length);
        for (int arrrray: newArrray){
            System.out.print(arrrray + " ");
        }
    }

    // Ex5. Create a two-dimensional string array [2][2]. Assign values to the
    // 2-dimensional array containing any Country and City.
    public static void ex5() {
        System.out.println("\n");
        System.out.println("----------------");
        String[][] cC = new String[2][2];
        cC[0][0] = "France";
        cC[0][1] = "Paris";

        cC[1][0] = "Sweden";
        cC[1][1] = "Stockholm";

        for (int i = 0; i < cC.length; i++) {

            for (int j = 0; j < cC[i].length; j++) {
                System.out.print(cC[i][j] + "\t");
            }
            System.out.println("\n");

        }
    }

        // Ex6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14
        // and print the average of these 6 numbers.
    public static void ex6(){
        int[] siffror = {43, 5, 23, 17, 2, 14};
        Arrays.sort(siffror);
        System.out.print("[");
        for (int siff : siffror) {
            System.out.print(siff + ", ");
        }
        System.out.print("\b\b"); // Two backspaces --> Remove 2 characters backwards:(, )
        System.out.println("]");
        // Average:
        double total = 0;
        for(int i=0; i<siffror.length; i++){
            total = total + siffror[i];
        }
        double average = total / siffror.length;
        System.out.format("The average is: " + average);
    }
    }
