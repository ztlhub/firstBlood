import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc47 {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> prem=new ArrayList<>();
        int len=nums.length;
        boolean[] visit=new boolean[len];
        Arrays.sort(nums);
        backtrack(nums,ans,prem,0,len,visit);
    }
    public static void backtrack(int[] nums,List<List<Integer>> ans,List<Integer> prem,int idx,int n,boolean[] visit){
        if(idx==n){
            ans.add(new ArrayList<>(prem));
            return;
        }
        for(int i=0;i<n;i++){
            if(visit[i]||(i>0&&nums[i]==nums[i-1])){
                continue;
            }
            visit[i]=true;
            prem.add(nums[i]);
            backtrack(nums,ans,prem,idx+1,n,visit);
            visit[i]=false;
            prem.remove(idx);

        }
    }


}
