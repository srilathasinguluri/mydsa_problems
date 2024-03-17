package dsa;
import java.util.*;
class maxsubarray {//kaden's algorithm
	// Driver Code
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
       
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
		System.out.println("Maximum contiguous sum is "
						+ maxSubArraySum(a));
                        sc.close();
	}

	// Function Call
	static int maxSubArraySum(int a[])
	{
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here	= 0;
		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_ending_here>max_so_far)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
}

