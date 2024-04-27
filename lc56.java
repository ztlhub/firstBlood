import java.util.Arrays;
import java.util.Comparator;

public class lc56 {
    public static void main(String[] args) {
        int[][] intervals = {{2,3},{4,6},{5,7},{3,4}};
        int len2=intervals.length;
        for(int m=0;m<len2;m++){
            for(int n=0;n<len2-m-1;n++){
                if(intervals[n][0]>intervals[n+1][0]){
                    int start=intervals[n][0];
                    int end=intervals[n][1];
                    intervals[n][0]=intervals[n+1][0];
                    intervals[n][1]=intervals[n+1][1];
                    intervals[n+1][0]=start;
                    intervals[n+1][1]=end;
                }
            }
        }
        int[][] merge = deleteDouble(intervals);
        int len=merge.length;
        for(int i=0;i<len;i++) {
            System.out.print("["+merge[i][0]+" "+merge[i][1]+"]");
        }
    }
    public static int[][] deleteDouble(int[][] intervals){
        int len=intervals.length;
        int num=0;
        for(int i=0;i<len;i++){
            if(intervals[i][0]==-1){
                continue;
            }
            for(int j=0;j<len;j++){
                if(j==i||intervals[j][0]==-1){
                    continue;
                }
                if(intervals[i][1]>=intervals[j][0]&&intervals[i][1]<intervals[j][1]&&intervals[i][0]<=intervals[j][0]){
                    intervals[i][1]=intervals[j][1];
                    intervals[j][0]=-1;
                    intervals[j][1]=-1;
                    num++;
                }
                else if(intervals[j][1]>=intervals[i][0]&&intervals[j][1]<intervals[i][1]&&intervals[j][0]<=intervals[i][0]){
                    intervals[j][1]=intervals[i][1];
                    intervals[i][0]=-1;
                    intervals[i][1]=-1;
                    num++;
                }
                else if(intervals[i][0]<=intervals[j][0]&&intervals[i][1]>=intervals[j][1]){
                    intervals[j][0]=-1;
                    intervals[j][1]=-1;
                    num++;
                }
            }
        }
        int[][] merge = new int[len-num][2];
        int start=0;
        for(int m=0;m<len;m++){
            if(intervals[m][0]==-1){
                continue;
            }
            merge[start][0]=intervals[m][0];
            merge[start][1]=intervals[m][1];
            start++;
        }

        return merge;
    }
}
