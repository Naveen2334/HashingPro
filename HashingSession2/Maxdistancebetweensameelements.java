package HashingSession2;

import java.util.HashMap;

public class Maxdistancebetweensameelements {
	 int maxDistance(int arr[], int n)
	    {
		   HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		   for(int i=0;i<n;i++){
		       if(!hs.containsKey(arr[i])){
		           hs.put(arr[i],i);
		       }
		   }
		   int max=0;
		   for(int i=n-1;i>=0;i--){
		       max=Math.max(max,i-hs.get(arr[i]));
		   }
		   return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
