
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Mozliwe dzialania:");
    System.out.println("1 - Suma");
    System.out.println("2 - Roznica");
    System.out.println("3 - Iloczyn");
    System.out.println("4 - Iloraz");
    System.out.println("5 - Pole prostokata");
    System.out.println("6 - Pole trojkata");
    System.out.println("7 - a^2 + b^2 + c^2");
    System.out.println("8 - Najmniejsza liczba sposrod podanych\n");

    System.out.println("Podaj pierwsza liczbe:");
    double a = scanner.nextDouble();

    System.out.println("Podaj druga liczbe:");
    double b = scanner.nextDouble();

    System.out.println("Podaj trzecia liczbe:");
    double c = scanner.nextDouble();

    scanner.nextLine();

    while (true) {
      System.out.println("\nWybierz dzialanie (1-8):");
      String wejscie = scanner.nextLine();

      if (!wejscie.matches("[1-8]")) {
        System.out.println("\nBlad wyboru (bez liter ani innych znaków oraz liczby z zakresu od 1 do 8)");
        continue;
      }

      int wybor = Integer.parseInt(wejscie);

      switch (wybor) {

        case 1:
          System.out.println("Wynik: " + (a + b));
          break;

        case 2:
          System.out.println("Wynik: " + (a - b));
          break;

        case 3:
          System.out.println("Wynik: " + (a * b));
          break;

        case 4:
          if (b == 0) {
            System.out.println("Nie mozna dzielic przez 0");
          } else {
            System.out.println("Wynik: " + (a / b));
          }
          break;

        case 5:

          System.out.println("Pole prostokata wynosi: " + (a * b));
          break;

        case 6:

          double p = (a + b + c) / 2;
          double pole = Math.sqrt(p * (p - a) * (p - b) * (p - c));

          System.out.println("Pole trojkata wynosi: " + pole);
          break;

        case 7:
          double a1 = a * a;
          double b1 = b * b;
          double c1 = c * c;

          System.out.println("Wynik: " + (a1 + b1 + c1));
          break;

        case 8:
          if (a < b && a < c) {
            System.out.println("Najmniejsza liczba to: " + a);
          } else if (b < a && b < c) {
            System.out.println("Najmniejsza liczba to: " + b);
          } else if (c < a && c < b) {
            System.out.println("Najmniejsza liczba to: " + c);
          } else {
            System.out.println("Liczby sa rowne");
          }
          break;

        default:
          System.out.println("Wybor niepoprawny. Podaj liczbe od 1 do 8.");
      }

    }
  }
}
