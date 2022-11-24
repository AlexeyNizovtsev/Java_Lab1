import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args){
            Scanner date= new Scanner(System.in);
            int month, day;

            do{
                System.out.print("Введите день: ");
                day= date.nextInt();
            }while(day<1 || day>31);

            do{
                System.out.print("Введите месяц: ");
                month= date.nextInt();
            }while(month<1 || month>12);

            if (((month==4 || month==6 || month==9 || month==11) && (day>30)) || (month==2 && day>28)) {
                System.out.println("Данные неккоректны!");
                System.exit(0);
            }

            if ((month>0 && month<3) || (month==12)) System.out.println("Зима");
            else if (month>2 && month<6) System.out.println("Весна");
            else if (month>5 && month<9) System.out.println("Лето");
            else if (month>8 && month<12) System.out.println("Осень");

    }
}