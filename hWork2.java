import java.util.Scanner;

public class hWork2 {
    public static void main(String[] args) {
        double Cours = 0.973;
        System.out.printf("%.3f", DolToEur(120, Cours));
    }
    static double DolToEur (double Dol, double Cours) {
        return Dol * Cours;
    }
}
