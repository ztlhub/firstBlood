import java.util.Scanner;
public class lc53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] nums=new int[n];
//        for(int i=0;i<n;i++) {
//            nums[i] = sc.nextInt();
//        }
        int[] nums={-3,3,-2,2};
        int result = calMax(nums);
        System.out.println(result);
    }
    public static int calMax(int[] nums){
        int len = nums.length;
        int start = -1;
        int max = nums[0];
        int i=0,result=0;
        for(i=0;i<len;i++){
            if(nums[i]>0){
                start=i;
                break;
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        if((max<0||max==0)&&i==len){
            return max;
        }
        else{
            result=nums[start];
            while(start<len){
                int sum = nums[start];
                int temp2 = start;
                for(int j=start+1;j<len;j++){
                    sum+=nums[j];
                    temp2=j;
                    if(sum<0||sum==0){
                        break;
                    }
                    result=Math.max(result,sum);
                }
                for(int m=temp2;m<len;m++){
                    if(nums[m]>0&&m<len-1){
                        start = m;
                        result=Math.max(result,nums[m]);
                        break;
                    }
                    result=Math.max(result,nums[m]);
                    start=m+1;
                }

            }
        }
        return result;
    }

}
