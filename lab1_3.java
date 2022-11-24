import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("x: ");
        int x= sc.nextInt();

        int n;
        do{
            System.out.print("n: ");
            n= sc.nextInt();
        }while(n<-15 || n>15);

        if (n==0) System.out.println('1');

        else if (n>0){
            int step=1;
            for(int i=0; i<n; i++) step*= x;
            System.out.println(step);
        }

        else if (n<0){
            float step=1;
            for(int i=0; i>n; i--) step/= x;
            System.out.println(step);
        }


    }
}