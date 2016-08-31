import java.util.*;
import java.io.*;

class Javaloops{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int j = 0;
            String s = "";
            double powerresult = Math.pow(2, j);
            int powerresultint = (int)powerresult;
            int firstelement = a + (powerresultint * b);
            s = s + firstelement;
            j++;
            while(j<n){
                powerresult = Math.pow(2, j);
                powerresultint = (int)powerresult;
                int secondelement  = firstelement + (powerresultint * b);                
                s = s + " " + secondelement;
          //      System.out.println(s);

                firstelement = secondelement;
                j++;
            }
            System.out.println(s);
        }
        in.close();
    }
}