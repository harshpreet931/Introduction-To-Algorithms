public class Q2_1_3 
{
    public static void main(String[] args) 
    {
        // searching for a given value in an array
        int[] arr = {31, 41, 59, 26, 41, 58};
        int v = 26;

        search(arr, v);
    }    

    public static void search(int[] arr, int v) 
    {
        for(int i = 0; i < arr.length; i++) 
        {
            if(arr[i] == v) 
            {
                System.out.println("Found " + v + " at index " + i);
                return;
            }
        }

        System.out.println("Value " + v + " not found in the array");
    }
}
