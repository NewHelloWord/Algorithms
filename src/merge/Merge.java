package merge;

/**
 * 原地归并的抽象方法
 */
public class Merge {
    
    public static void merge(int[] a, int lo, int mid, int hi){
        
        int N = a.length;
        int[] b = new int[N];
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            b[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if(i > mid){
                a[k] = b[j++];
            }else if(j > hi){
                a[k] = b[i++];
            } else if(b[i] < b[j]){
                a[k] = b[i++];
            }else{
                a[k] = b[j++];
            }
        }
    }

    public static void main(String[] arg){
        int[] a = {1,4,7,18,2,9,13,17};
        merge(a,0,3,7);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

}
