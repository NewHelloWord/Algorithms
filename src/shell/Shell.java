package shell;

/**
 * 希尔排序
 */
public class Shell {

    public static void sort(int[] a){

        int N = a.length;
        int h = 1;
        while(h < N/3){     //  h = 1/2(3^k - 1)  1, 4, 13, 40, 121, 364, 1093, ...
            h = 3*h + 1;    //   选取合适的递增数列可以提高算法性能  这里使用Algorithms一书中推荐的递增数列
        }
        while(h >=1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && (a[j] < a[j-h]); j -= h) {
                    int temp = a[j];
                    a[j] = a[j-h];
                    a[j-h] = temp;
                }
            }
            h = h/3;
        }
    }

    public static void main(String[] srg){
        int[] a = {88,5,2,7,4,223,63,234,563,24,765,3,9,56,35,23};
        sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

}
