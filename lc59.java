public class lc59 {
    public static void main(String[] args) {
        int n=3;
        int[][] matrixs=new int[n][n];
        boolean[][] flag=new boolean[n][n];
        int row=0,column=0;
        int len=n;
        int i=0;
        while(i<len*len){
            while(column<n&&flag[row][column]==false){
                i++;
                matrixs[row][column]=i;
                flag[row][column]=true;
                column++;
            }
            column--;
            row++;
            while(row<n&&flag[row][column]==false){
                i++;
                matrixs[row][column]=i;
                flag[row][column]=true;

                row++;
            }
            row--;
            column--;
            // System.out.println(row);
            while(column>=0&&flag[row][column]==false){
                i++;
                matrixs[row][column]=i;
                flag[row][column]=true;

                column--;
            }
            column++;
            row--;
            while(row>=0&&flag[row][column]==false){
                i++;
                matrixs[row][column]=i;
                flag[row][column]=true;
                row--;
            }
            row++;
            column++;
            n-=1;
        }
        for(int m=0;m<len;m++){
            for(int l=0;l<len;l++){
                System.out.print(matrixs[m][l]);
            }
            System.out.println();
        }
    }
}
