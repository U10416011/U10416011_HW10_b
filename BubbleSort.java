
public class BubbleSort {
	
    public static void Sort(int[] a){
        for (int i = a.length - 1; i > 0; --i)
            for (int j = 0; j < i; ++j)
                if (a[j] > a[j + 1])
                    Swap(a, j, j + 1);
    }
    public static void Swap(int[] array, int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
    
}
