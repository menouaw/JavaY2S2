package fr.esgi.poo.java.Mathematix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcAlphaNum {
    public CalcAlphaNum() {
        String input = "";
        int rdi = 0;
        int rsi = 0;
        String operator = "";
        int result;

        try {
            System.out.println("Entrez les chiffres séparés par l'opérateur: ");

            Scanner sc = new Scanner(System.in);
            input = sc.next();
            rdi = sc.nextInt();
            operator = sc.next();
            rsi = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Calcul incorrect.");
            System.exit(1);
        }

        result = switch (operator) {
            case "+" -> rdi + rsi;
            case "-" -> rdi - rsi;
            default -> 0;
        };

        System.out.printf("%d %s %d = %d", rdi, operator, rsi, result);
    }
}
