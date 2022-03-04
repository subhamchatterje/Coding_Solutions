

import java.util.*;


public class ContinuousSubArrayProblem {
   
    ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int sum=0 , i, StartIndex, EndIndex;

        ArrayList<Integer>position = new ArrayList<>();

        for(i=0 ; i<n ; i++){

            sum = 0;
            StartIndex = i;
            EndIndex = i;

            while(sum <= s && EndIndex < n){
                sum=sum + arr[ EndIndex++ ];

                if(sum == s){

                    position.add( StartIndex+1 );
                    position.add( EndIndex );
                    return( position );  
                }
            }
        }

        position.add( -1 );
        return( position );
    }
}
                
  

