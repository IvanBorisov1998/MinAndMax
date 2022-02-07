import java.util.ArrayList;
import java.util.List;

public class MinAndMax {
	public static void main(String[]args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(0,1);
		arr.add(1,3);
		arr.add(2,5);
		arr.add(3,7);
		arr.add(4,9);
		miniMaxSum(arr);
	}
	public static void miniMaxSum(List<Integer> arr) {
        int min = 0;
            int max = 0;
           int  minEl=arr.get(0);
                   int  maxEl=arr.get(0);
          for(int i = 0 ; i <arr.size(); i++) {
              if(minEl>arr.get(i)) {
                  minEl=arr.get(i);
                  min=i;
              }
              if(maxEl<arr.get(i)) {
                  maxEl=arr.get(i);
                  max = i;
              }
          }
          long maxSum=0;
          long minSum=0;
          for(int i =0;i<arr.size();i++) {
              if(max!=i) {
                  minSum=minSum+arr.get(i);
              }
              if(min!=i) {
                  maxSum=maxSum+arr.get(i);
              }
          }
          System.out.println(minSum+" "+maxSum);
    }

}

