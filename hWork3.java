import java.util.Scanner;

public class hWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] curDateDMY = {18, 8, 2022};

        System.out.println("Привет! Назови свое имя пожалуйста.");
        String name = scan.next();

        System.out.println("Скажи месяц и год своего рождения через Enter(m, y).");
        int[] dateDMY = {0, scan.nextInt(), scan.nextInt()};

        if (dateDMY[1] == 8){
            System.out.println("Твой месяц рождения совпадает с нынешним." +
                    " Назови день своего рождения, чтобы я мог корректно ответить.");
            dateDMY[0] = scan.nextInt();
        }

        int years = howOldAreYou(name, dateDMY, curDateDMY);
        currentYearsRus(years);
    }
    static int howOldAreYou(String name, int[] dateDMY, int[] curDateDMY){
        int years = curDateDMY[2] - dateDMY[2];

        if (dateDMY[0] == 18) {
            System.out.printf("С днем рождения, %s! Тебе исполнилось %d ", name, years-1);
            return years-1;
        }
        else if (dateDMY[0] > 18 || dateDMY[1] > 8) {
            System.out.printf("%s, тебе %d ", name, years-1);
            return years-1;
        }
        else if (dateDMY[0] < 18 || dateDMY[1] < 8) {
            System.out.printf("%s, тебе %d ", name, years);
            return years;
        }

        return 404;
    }

    static void currentYearsRus (int years){
        if (years - (years % 10) == 1 || years % 10 == 5 || years % 10 == 6 || years % 10 == 7 ||
                years % 10 == 8 || years % 10 == 9 || years % 10 == 0)
            System.out.println("лет.");
        else if(years % 10 == 1)
            System.out.println("год.");
        else
            System.out.println("года.");
    }
}
