/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t!=0)
		{
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[]= br.readLine().trim().split(" ");
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    int res=arr[0];
		    int maxending=arr[0];
		    for(int i=1;i<n;i++)
		    {
		        maxending = Math.max(maxending+arr[i],arr[i]);
		        res= Math.max(maxending, res);
		    }
		    System.out.println(res);
		    t--;
		}
	}
}
