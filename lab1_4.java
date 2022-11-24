import java.util.Scanner;

public class lab1_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Введите количество точек: ");
        int N= sc.nextInt();

        System.out.print("Введите радиус окружности: ");
        int R= sc.nextInt();

        int cnt=0;
        for(int i=0; i<N; i++){
            System.out.print("X "+(i+1)+ " точки: ");
            float x= sc.nextFloat();
            System.out.print("Y "+(i+1)+ " точки: ");
            float y= sc.nextFloat();

            if((x*x)+(y*y)<= (R*R)) cnt+=1;
        }

        System.out.println(cnt+ " точек попали в окружность");


    }
}