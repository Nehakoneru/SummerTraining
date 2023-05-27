 public class HeapSort {
   static void heapify(int arr[] ,int n,int i ){
        int largest =i,left=2*i+1,right=2*i+2;
        if(left<n && arr[left] <arr [largest])
        largest=right;
        if(right<n && arr[right] < arr[largest])
        largest=left;
        if(largest !=i) swap(arr[i],arr[largest]);
            heapify(arr,n,largest);
    }
    static void swap(int a,int b)
    {
    int t=a;
    a=b;
    b=t;
    }
    static void printElements(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={25,67,87,6,90,7};
        for(int i=0;i<arr.length;i++)
        {
            heapify(arr,arr.length,i)
        }
    }
        
    }