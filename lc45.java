import java.util.Scanner;
public class lc45 {
    public static void main(String[] args) {
        int[] nums={0,1};
        int len=nums.length;
        int end=len-1;
        int temp=end;
        int i=temp-1;
        int result=0;
        if(nums[0]==0){
            System.out.println(0);
        }
        while(end>0){
            for(int j=end;j>=0;j--){
                if(j+nums[j]>=end){
                    temp=j;
                }
            }
            end=temp;
            result++;
        }
        System.out.println(result);
    }

}
