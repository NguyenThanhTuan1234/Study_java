package array;

import java.util.Arrays;

/**
 * Created by tuankun on 17/06/2017.
 */
public class sapxep_chen1phantu {
    public static void main(String[] args) {
        int[] array = {3, 6, 1, 4, 2, 7, 9, 10, 8};
        Arrays.sort(array);                             //sap xep mang
        printArray("Sorted array",array);
        int index = Arrays.binarySearch(array,5);
        System.out.println("Didn't find 5 @" + index);
        int newIndex = -index -1;
        array = insertElement( array , 5 , newIndex);
        printArray("With 5 added", array);
    }
    public static void printArray(String message, int array[]){            //Ham in thong tin
        System.out.print(message + "[Length: "+ array.length + "]");
        for (int i=0; i<array.length;i++){
            if(i!=0){
            System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
    private static int[] insertElement(int[] original, int element, int index){
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original,0,destination,0,index);
        destination[index]=element;
        System.arraycopy(original,index,destination,index+1,length - index);
        return destination;
    }


}
