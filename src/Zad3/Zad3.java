package Zad3;
import java.util.Scanner;
import java.util.Arrays;
public class Zad3 { public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] arr = new int [3];
    arr[0] = scanner.nextInt();
    arr[1] = scanner.nextInt();
    arr[2] = scanner.nextInt();
    System.out.println("Tablica przed:");
    printArray(arr);
    sortArray(arr);
    System.out.println("Tablica po:");
    printArray(arr);
}
public static void sortArray (int[] arr2){
    Arrays.sort(arr2);
}
public static void printArray (int[] arr1){
    for (int i = 0; i<arr1.length; i++){
        System.out.println(arr1[i]);
    }}}
