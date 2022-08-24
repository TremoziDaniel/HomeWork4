import java.util.Scanner;

public class hWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        boolean c = true;
        additionOfNumbers(a, b, c);
        subtractionOfNumbers(a, b, c);
        multiplicationOfNumbers(a, b, c);
        divisionOfNumbers(a, b, c);
    }

    static void additionOfNumbers (double a, double b, boolean c){
        if(c)
            System.out.println("Сложение: " + (a + b));
    }

    static void subtractionOfNumbers (double a, double b, boolean c){
        if(c)
            System.out.println("Вычитание: " + (a - b));
    }

    static void multiplicationOfNumbers (double a, double b, boolean c){
        if(c)
            System.out.println("Умножение" + (a * b));
    }

    static void divisionOfNumbers (double a, double b, boolean c){
        if(c)
            System.out.println("Деление: " + (a / b));
    }
}
