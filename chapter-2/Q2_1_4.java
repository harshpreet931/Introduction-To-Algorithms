public class Q2_1_4 
{
    // add 2 n bit binary numbers and store the result in a n+1 bit binary number
    
    public static void main(String[] args) 
    {
        int[] a = {1, 0, 1, 1};
        int[] b = {1, 1, 1, 0};
        
        int[] c = add(a, b);    

        System.out.println(java.util.Arrays.toString(c));
    }

    public static int[] add(int[] a, int[] b)
    {
        int n = a.length;
        int[] c = new int[n+1];
        int carry = 0;
        for (int i = n-1; i >= 0; i--)
        {
            c[i+1] = (a[i] + b[i] + carry) % 2;
            carry = (a[i] + b[i] + carry) / 2;
        }
        c[0] = carry;
        return c;
    }
}
