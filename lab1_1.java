import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) {
        Scanner date= new Scanner(System.in);
        int bday, bmonth, byear;
        int curday= 25;
        int curmonth= 11;
        int curyear= 2022;
        do {
            System.out.print("Введите день Вашего рождения: ");
            bday = date.nextInt();
        }while (bday<0 || bday>31);

        do {
            System.out.print("Введите месяц Вашего рождения: ");
            bmonth= date.nextInt();
        }while (bmonth<0 || bmonth>12);

        do {
            System.out.print("Введите год Вашего рождения: ");
            byear= date.nextInt();
        }while (byear<1000 || byear>2022);

        if (((bmonth==4 || bmonth==6 || bmonth==9 || bmonth==11) && (bday>30)) || (bmonth==2 && bday>28)) {
            System.out.println("Данные неккоректны!");
            System.exit(0);
        }


        if (curmonth> bmonth) System.out.print((curyear - byear) + " лет, "+ (curmonth-bmonth)+ " месяцев и "+ (curday-1)+ " дней");

        else if (curmonth<bmonth) System.out.print((curyear - byear-1) + " лет, "+ (curmonth)+ " месяцев и "+ Math.max(curday-bday, curday)+ " дней");

        else if (curmonth == bmonth) {
            if (curday < bday)
                System.out.print((curyear - byear - 1) + " лет, " + (curmonth) + " месяцев и " + (curday) + " дней");

            else if (curday == bday) System.out.print("С днём рождения! Вам уже " + (curyear - byear) + " лет!");

            else if (curday > bday)
                System.out.print((curyear - byear) + " лет, 0 месяцев и " + (curday - bday) + " дней");
        }




    }
}