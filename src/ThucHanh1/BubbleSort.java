package ThucHanh1;

public class BubbleSort {
    static int[] list = {2,3,2,5,6,1,-2,3,14,12};

    public static void bubbleSort(int[] list){


        // nổi bọt khi chạy j=length-1 về 0. cách này dễ hiểu hơn!!!!



        for (int i = 0; i < list.length; i++) {
            for (int j = list.length-1; j >i ; j--) {
                if(list[j]<list[j-1]){
                    int temp = list[j];
                    list[j]=list[j-1];
                    list[j-1]=temp;
                }
            }

        }






      //sx nổi bọt khi chạy j từ 0->list.length
//        boolean needNextPass = true;
//
//        for (int k = 1; k < list.length && needNextPass; k++) {
//            needNextPass =false;
//            for (int i = 0; i < list.length-k; i++) {
//                if(list[i]>list[i+1]){
//                    int temp = list[i];
//                    list[i]=list[i+1];
//                    list[i+1]=temp;
//
//                    needNextPass=true;
//                }
//            }
//        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }



}
