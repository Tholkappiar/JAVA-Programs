import java.util.Arrays;
class Bubble_Sort {
    public static void main(String args[])
    {
        int arr[]={9,8,7,6,5,4,3,2,2,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int arr[])
    {
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

    }   
}
