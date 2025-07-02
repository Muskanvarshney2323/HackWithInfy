package ActivitySelection;

import java.util.Arrays;

public class activitySort {
    public static void main(String []args){
        int arr[][] = {{1, 3}, {2, 4}, {3,5}, {0, 6},{5,7}, {8,9}};
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        System.out.println(Arrays.deepToString(arr));
        int count = 1;
        int LastEnd = arr[0][1];
        for(int i = 1; i < arr.length; i++){
            if(arr[i][0] >= LastEnd){
                count++;
                LastEnd = arr[i][1];
            }
        }
        System.out.println("Maximum number of activities that can be performed: " + count);
    }
    
}
