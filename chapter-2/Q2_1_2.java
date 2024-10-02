import java.util.*;

class Q2_1_2 {
    public static void main(String[] args) 
    {
        // insertion sort in nondecreasing order

        int[] arr = {31, 41, 59, 26, 41, 58};

        for(int j = 1; j < arr.length; j++)
        {
            int key = arr[j];
            int i = j - 1;

            while(i >= 0 && arr[i] < key)
            {
                arr[i+1] = arr[i];
                i--;
            }

            arr[i+1] = key;
        }

        System.out.println(Arrays.toString(arr));

    }    
}
