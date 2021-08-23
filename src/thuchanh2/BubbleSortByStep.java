package thuchanh2;

import java.util.Scanner;

public class BubbleSortByStep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size của mảng : ");
        int size = scanner.nextInt();
        int[] list= new int[size];
        System.out.println("Enter " + list.length + " Values: ");
        for (int i = 0; i < list.length; i++) {
            list[i]=scanner.nextInt();
        }
        System.out.println("Các phần tử của mảng là : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ " ");
        }
        System.out.println() ;
        System.out.println("Mảng đã sắp xếp là: ");
        showBubbleSortByStep(list);
    }

    private static void showBubbleSortByStep(int[] list) {
        bubbleSortByStep(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+"");

        }
    }

    public static void bubbleSortByStep(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[min] > list[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = list[min];
                list[min] = list[i];
                list[i] = temp;
            }
        }

    }








//        //pp nổi bọt
//        for (int i = 0; i < list.length; i++) {
//            for (int j = list.length-1; j >i; j--) {
//                if(list[j]<list[j-1]){
//                    int temp = list[j];
//                    list[j]=list[j-1];
//                    list[j-1]=temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i]+" ");
//        }





}
