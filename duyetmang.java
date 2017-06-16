package array;

/**
 * Created by tuankun on 16/06/2017.
 */
public class duyetmang {
    public static void main(String[] args) {
        int array[] = {10,8,9,7,5,6,4,3,2,1};
        sapxep(array);
        for(int i=0; i < array.length; i++){
            System.out.print(array[i]+", ");
        }

    }
    public static void sapxep(int array[]){
        for(int m=0; m<array.length; m++)
            for(int n=m+1; n<array.length; n++)
                if(array[m]>array[n]){
                    int tam = array[m];
                    array[m] = array[n];
                    array[n] = tam;
                }
    }
}
