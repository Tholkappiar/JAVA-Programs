public class Linear_Search_1D {
    public static void main(String args[])
    {
        int arr[]={1,2,3,6,71,5};
        int target=6;
        System.out.println(LinearSearch(arr, target));
    }
    static int LinearSearch(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
