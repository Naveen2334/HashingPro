package HashingSession9;

import java.util.HashMap;
import java.util.Map;

public class Helloworld {
	 int maxLen(int arr[], int n)
	    {
	        int ln = 0;
	        int sum = 0;
	        Map<Integer , Integer> hmap = new HashMap<>();
	        hmap.put(0, -1);
	        for(int i=0; i < arr.length;i++){
	            sum  += arr[i];
	            if(hmap.containsKey(sum)){
	                ln = Math.max(ln,i-hmap.get(sum));
	            }
	            else{
	                hmap.put(sum,i);
	            }
	        }
	        return ln;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
