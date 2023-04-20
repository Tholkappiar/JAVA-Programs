package Sorting;


public class missing {
    public static void main(String[] args) {
        int[] arr={2,1,4,0};
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i]!=arr[correct])
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index)
            {
                System.out.println(index);
            }
            else{
                System.out.println(0);
            }
        }

    }
}
