import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
             int cont = 0;
            for (int x = 1; x<=n; x++ ){
                if(x==1){
                    cont = a + (int) Math.pow(2,x-1)*b;
                    System.out.print(cont+ " ");
                    continue;
                }
                cont += (int) Math.pow(2,x-1)*b;
                System.out.print(cont+ " ");
            }
            System.out.println();
        }
        in.close();
    }
}