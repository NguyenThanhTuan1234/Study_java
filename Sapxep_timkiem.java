package array;

import java.util.Arrays;

/**
 * Created by tuankun on 16/06/2017.
 */
public class Sapxep_timkiem {
    public static void main(String[] args) throws Exception {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        for(int i=0; i < array.length; i++){
            System.out.print(array[i]+", ");
        }
    }
}
