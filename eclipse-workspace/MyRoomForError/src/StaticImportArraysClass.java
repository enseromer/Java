
// static import Arrays.sort method 
import static java.util.Arrays.sort;

public class StaticImportArraysClass {

  public static void main(String[] args) {
    
    int[] nums = {1,4,6,8,9,0,12}; 
    
    sort(nums);
    
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
    
    
    

  }

}