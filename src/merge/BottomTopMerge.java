package merge;

/**
 * 自底向上的归并排序
 */
public class BottomTopMerge {

    public static void sort(int[] a){

        int N = a.length;
        for (int sz = 1; sz < N; sz = 2*sz) {     //子数组的大小
            for (int lo = 0; lo < N - sz; lo += 2*sz) {   // lo为子数组的索引
                Merge.merge(a, lo, lo + sz - 1, Math.min(N - 1, lo + 2*sz -1));
            }
        }
    }

    public static void main(String[] srg){
        int[] a = {88,5,2,7,4,223,63,234,563,24,765,3,9,56,35,23,8};
        sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

}
