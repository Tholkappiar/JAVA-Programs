public class Linear_Search_2D {
    public static void main(String args[])
    {
        int arr[][]={
            {1,2,3,4,5},
            {9,8,7,6,5}
        };
        int target=5;
       LinearSearch(arr,target);
    }
    static void LinearSearch(int arr[][],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                   System.out.println("The target indexes are : " + i+""+j);
                }
            }
        }
    }
}
