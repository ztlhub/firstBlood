import java.util.ArrayList;
import java.util.List;

public class lc57 {
    public static void main(String[] args) {
        int[][] intervals = {{1,5}};
        int[] newinterval={2,3};
        int len=intervals.length;
        int[][] merge=insertIntervals(intervals,newinterval);
        int len2=merge.length;
        for(int i=0;i<len2;i++) {
            System.out.print("["+merge[i][0]+" "+merge[i][1]+"]");
        }
    }
    public static int[][] insertIntervals(int[][] intervals,int[] newinterval) {
        int len = intervals.length;
        int start = newinterval[0];
        int end = newinterval[1];
        List<int[]> ans=new ArrayList<>();
        boolean flag=false;
        for(int []interval:intervals){
            if(interval[0]>end) {
                if (!flag) {
                    flag = true;
                    ans.add(new int[]{start, end});
                }
                ans.add(interval);
            }
            else if(interval[1]<start){
                ans.add(interval);
            }
            else{
                start=Math.min(start,interval[0]);
                end=Math.max(end,interval[1]);
            }
        }
        if(!flag){
            ans.add(new int[]{start,end});
        }
        int[][] merge=new int[ans.size()][2];
        for(int i=0;i<len;i++){
            merge[i]=ans.get(i);
        }
        return merge;
    }
}
