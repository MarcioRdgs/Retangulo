import java.util.Scanner;

public class Aula_01 {
  Scanner input = new Scanner(System.in);
  
  public static void retangulo(String[] args) {
    double base, altura, area;

      base = input.nextDouble();
      altura = input.nextDouble();
      area = base * altura;
  }
}
