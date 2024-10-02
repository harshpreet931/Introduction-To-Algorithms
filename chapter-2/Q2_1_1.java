import java.util.*;

class Q2_1_1 
{
    // insertion sort on A = {31, 41, 59, 26, 41, 58}
    // pick 41 and put it in its rightful place which would be after 31, A = {31, 41, 59, 26, 41, 58}
    // pick 59 and put it in its rightful place which would be after 41, A = {31, 41, 59, 26, 41, 58}
    // pick 26 and put it in its place which would be before 31, A = {26, 31, 41, 59, 41, 58}
    // pick 41 and put it after 41, A = {26, 31, 41, 41, 59, 58}
    // pick 58 and put it after the 2nd 41, A = {26, 31, 41, 41, 58, 59}

    public static void main(String[] args) 
    {
        int[] arr = {31, 41, 59, 26, 41, 58};

        // insertion sort
        for(int j = 1; j < arr.length; j++)
        {
            int key = arr[j];
            int i = j - 1;

            while(i >= 0 && arr[i] > key) 
            {
                arr[i+1] = arr[i];
                i--;
            }

            arr[i+1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}