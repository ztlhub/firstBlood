public class lc80 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,3};
        nums=deleteDouble(nums);
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i]);
        }
    }
    public static int[] deleteDouble(int[] nums){
        int len=nums.length;
        int calculate=0;
        int i=0;
        while(i<len){
            calculate=0;
            int temp=nums[i];
            for(int j=i;j<len;j++){
                if(nums[j]==temp){
                    calculate++;
                }
                else{
                    break;
                }
            }
            if(calculate>2) {
                for (int m = i + 2; m + calculate - 2 < len; m++) {
                    nums[m] = nums[m + calculate - 2];
                }
                len = len - calculate + 2;
//                i = i+2;
            }
            if(calculate>=2){
                i=i+2;
            }
            else{
                i++;
            }
        }
        int[] result =new int[len];
        for(int n=0;n<len;n++){
            result[n] = nums[n];
        }
        return result;
    }
}
