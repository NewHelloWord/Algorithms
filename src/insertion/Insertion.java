package insertion;

/**
 *插入排序
 */
public class Insertion {

    public static void sort(int[] a){

        int N = a.length;
        for (int i = 1; i < N; i++) {     //将a[i]插入到a[i-1],a[i-2],a[i-3]...之中
            for (int j = i; j > 0 && (a[j] < a[j-1]); j--) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
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
