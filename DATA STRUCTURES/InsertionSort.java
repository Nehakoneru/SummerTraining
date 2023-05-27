import java.util.Arrays;
class InsertionSort
 {
    static void insertionSort(int ar[])
    {
        int i,j,k,least;
        for(i=ar.length-1;i>=0;i--)
        {
            for (j=0;j<i;j++)
            {
                least=ar[i];
                if (ar[j]>least)
                {
                    for(k=i;k>j;k--)
                    ar[k]=ar[k-1];
                    ar[j]=least;
                }
            }
        }
    }
    public static void main(String args[]){
        int []arr={10,80,70,54,78 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
 }