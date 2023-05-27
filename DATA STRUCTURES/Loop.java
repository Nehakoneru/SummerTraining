 public class BooleanSortExample{
 static void bubbleSort(int[]arr)
 {
    int n = arr.length;
    int temp=0;
    for(int i=0;i<n;i++)
    {
        for(int j=1;j,(n-i);j++)
        {
            temp=arr[j-1];
            arr[j-1]=arr[i];
            arr[j]=temp;
        }
        }
    }
 }
 public static void main(String[]args){
    int arr[]={3,40,40,60.5};
    System.ot.println("Array Beefore Bubble Sort");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.print();
    bubbleSort(arr);
    System.ot.println("Array After Bubble Sort");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");  
    }
 }
