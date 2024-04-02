import java.util.Scanner;
public class tx1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        int n=sc.nextInt();
        int m=sc.nextInt();
        String[] bol=new String[n];
        for(int j=0;j<n;j++){
            bol[j]="R";
//            System.out.println(bol[j]);
        }
        System.out.println(bol[0]);
        for(int i=0;i<m;i++){
//            System.out.println(i);
            int u=sc.nextInt();
            u=u-1;
            int v=sc.nextInt();
            v=v-1;
            String c=sc.next();
            System.out.println(u+","+v+","+c);
            if(c.equals("W")){
                bol[u]="W";
                bol[v]="W";
            }
        }
        for(int s=0;s<n;s++){
            if(bol[s].equals("R")){
                num++;
//                System.out.println(num);
            }
        }
        System.out.println(num);
    }
}
