package Zad7;
import java.util.Scanner;
public class Zad7 {
    public class program{
        static void rysuj (int rozm){
        int i;
        int j;
        for (i=1;i<rozm;i++){
            for(j=1;j<=rozm;j++){
             if(i==1 || i==rozm || j==1 || j==rozm || i==j){
               System.out.println("*");
             }else{
               System.out.println(" ");
             }
            }
            System.out.println();
        }
    }
    static boolean waliduj (int n){
        return (n>=5) && (n%2==1);
    }
    public static void main (String[] args) {
      Scanner scanner = new Scanner (System.in);
      int n;
      boolean czyDobra;
      czyDobra = waliduj(n);
      if (czyDobra==false) {
          System.out.println("Liczba nieprawidłowa. Wpisz ponownie!");
      }
      while (czyDobra==false) {
          n=scanner.nextInt();
          czyDobra = waliduj(n);
          if(!czyDobra) {
              System.out.println("Liczba nieprawidłowa. Wpisz ponownie!");
          }
      }
      rysuj(n);
      System.out.println("Wprowadzona liczba jest prawidłowa. Oto rysunek.");
    }
}
