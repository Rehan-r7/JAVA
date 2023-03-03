
//Write a program to convert Roman to Integer
import java.util.Scanner;

public class roman {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s;

            int I, V, X, L, C, D, M;
            int rom = 0;
            char ch = ' ';

            I = 1;
            V = 5;
            X = 10;
            L = 50;
            C = 100;
            D = 500;
            M = 1000;

            System.out.print("Enter the roman number : ");
            s = sc.nextLine();

            for (int i = 0; i < s.length() - 1; i++) {

                ch = s.charAt(i);
                if (ch == 'I') {

                    rom += I;

                }
                if (ch == 'V') {
                    if (s.charAt(i - 1) == 'I') {
                        V -= I;
                        rom -= I;
                        rom += V;

                    } else {
                        rom += V;
                    }

                }
                if (ch == 'X') {
                    if (s.charAt(i - 1) == 'I') {
                        X -= I;
                        rom -= I;
                        rom += X;

                    } else {
                        rom += X;
                    }
                }

                if (ch == 'L') {
                    if (s.charAt(i - 1) == 'X') {
                        L -= X;
                        rom -= X;
                        rom += L;

                    } else {
                        rom += L;
                    }

                }
                if (ch == 'C') {
                    if (s.charAt(i - 1) == 'X') {
                        C -= X;
                        rom -= X;
                        rom += C;

                    } else {
                        rom += C;
                    }

                }
                if (ch == 'D') {
                    if (s.charAt(i - 1) == 'C') {
                        D -= C;
                        rom -= C;
                        rom += D;

                    } else {
                        rom += D;
                    }

                }
                if (ch == 'M') {
                    if (s.charAt(i - 1) == 'C') {
                        M -= C;
                        rom -= C;
                        rom += M;

                    } else {
                        rom += M;
                    }

                } 

            }
            System.out.println(rom);
        }

    }
}
