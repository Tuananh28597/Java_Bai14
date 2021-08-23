package Baitap1_InsertionSort;

import java.util.Scanner;

public class Main {
    public static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập độ dài của mảng: ");
        int size= scanner.nextInt();
        int[] arr = new int[size];
        System.out.println(" Hãy nhập vào " + size + " phần tử " );
        inputNumber(arr);

        System.out.println("Dãy phần tử bạn vừa nhập vào là: ");
        showArr(arr);

        System.out.println();
        System.out.println("Mảng khi đã sắp xếp là: ");

        insertionSort(arr);

        showArr(arr);


    }







    private static void inputNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
    }

    private static void showArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void insertionSort(int[] arr){
        int pos,x;
        for (int i = 1; i < arr.length; i++) {
            x=arr[i];
            pos=i;
            while(pos>0 && x<arr[pos-1]){
                arr[pos]=arr[pos-1];
                pos--;
            }
            arr[pos]=x;
        }
    }




}
