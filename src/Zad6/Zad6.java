package Zad6;
import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] arr = new int[10];
        for (int i=0; i<arr.length;i++){
            arr[i]=rd.nextInt(1000-100)+100;
        }
        System.out.println("Tablica przed:");
        printArray(arr);
        sortArray(arr);
        System.out.println("Tablica po");
        printArray(arr);
    }
    public static void printArray (int[] arr1){
        for (int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
    public static void sortArray (int[] arr2){
        Arrays.sort(arr2);
    }
}
