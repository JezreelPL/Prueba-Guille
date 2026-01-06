package diasemana;
import java.util.Scanner;
public class DiaSemana {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int num;  
      System.out.println("Bienvenido escribe un numero de la semana");
      System.out.println("Escribe un numero de la semana");
      num = teclado.nextInt();
    
          switch(num){
              case 1:
                  System.out.println("domingo");
                  break;
              case 2:
                  System.out.println("lunes");
                  break;
                  
              case 3:
                  System.out.println("martes");
                  break;
              case 4:
                  System.out.println("miercoles");
                  break;
              case 5:
                  System.out.println("jueves");
                  break;
              case 6:
                  System.out.println("viernes");
                  break;
              case 7:
                  System.out.println("sabado");
                  break;
              default:
                  System.out.println("Dia no encontrado");
                  break;
          }

    }
    
}
