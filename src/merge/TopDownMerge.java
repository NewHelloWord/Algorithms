package merge;

/**
 * 自顶向下的归并排序
 */
public class TopDownMerge {

    public static void sort(int[] a, int lo, int hi){    // lo,hi 数组下标

        if(hi <= lo){
            return;
        }
        int mid = lo + (hi-lo)/2;
        sort(a, lo, mid);       //将左半边排序
        sort(a, mid+1, hi);    //将右半边排序
        Merge.merge(a, lo, mid, hi);
    }

    public static void main(String[] srg){
        int[] a = {88,5,2,7,4,223,63,234,563,24,765,3,9,56,35,23,8};
        sort(a,0,a.length-1);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
