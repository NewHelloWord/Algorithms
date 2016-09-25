package selection;

/**
 * 选择排序
 */
public class Selection {

    public static void sort(int[] a){

        int N = a.length;        //数组长度
        for (int i = 0; i < N; i++){    //将a[i]与a[i+1...N]中最小的元素交换
            int min = i;        //最小元素的索引
            for (int j = i+1; j < N; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
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
