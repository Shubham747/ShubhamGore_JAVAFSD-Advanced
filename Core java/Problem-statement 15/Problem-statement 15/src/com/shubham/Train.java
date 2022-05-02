package com.shubham;
public class Train {
	// Returns minimum number of platforms required
	public static int findPlatform(double[] arr, double[] dep,
                                   int n)
    {
 
        // plat_needed indicates number of platforms
        // needed at a time
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;
 
        // run a nested  loop to find overlap
        for (i = 0; i < n; i++) {
            // minimum platform
            plat_needed = 1;
 
            for (j = i + 1; j < n; j++) {
                // check for overlap
                if ((arr[i] >= arr[j] && arr[i] <= dep[j])
                    || (arr[j] >= arr[i]
                        && arr[j] <= dep[i]))
                    plat_needed++;
            }
 
            // update result
            result = Math.max(result, plat_needed);
        }
 
        return result;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        double arr[] = { 9.00, 9.40, 9.50, 11.00, 15.00, 18.00 };
        double dep[] = { 9.10, 12.00, 11.20, 11.30, 19.00, 20.00 };
        int n = 6;
        System.out.println(
            "Minimum Number of Platforms Required = "
            + findPlatform(arr, dep, n));
    }

}
