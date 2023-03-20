package DsaBasic;
import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int amo= sc.nextInt();
        double dis=0.0;
        if (amo<=1000){
            dis=0.0;
        }
        else if (amo>=1001&&amo<=5000){
            dis=5.0;
        }
        else if (amo>=5001&&amo<=10000){
            dis=10.0;
        }
        else if (amo>10000){
            dis=15.0;
        }
        if(amo>30000){
            dis=dis+0.02;
        }
        double total= amo-(amo*dis);
        System.out.println(total);
    }


}
