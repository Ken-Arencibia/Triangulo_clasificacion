import java.util.Scanner;
public class Triangulo_clasificacion {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Introduzca los datos que se le piden a continuación para determinar si es posible elaborar un triángulo con ellos.");
        System.out.println("Diga la longitud del primero lado.");
        double lado1 = p.nextDouble();
        System.out.println("Diga la longitud del segundo lado.");
        double lado2 = p.nextDouble();
        System.out.println("Diga la longitud del último lado.");
        double lado3 = p.nextDouble();
        if(lado1+lado2>=lado3 && lado1+lado3>=lado2 && lado2+lado3 >= lado1 ){
            System.out.println("Sí es posible elaborar un triángulo con los datos introducidos.");     
        if(lado1==lado2 && lado2==lado3){
            System.out.println("El triángulo elaborado sería equilátero");
        }else if(lado1==lado2 || lado2==lado3 || lado1==lado3){
            System.out.println("El triángulo elaborado sería isósceles");
        }else{
            System.out.println("El triángulo elaborado sería escaleno");
          }
         }else{
            System.out.println("No es posible elaborar un triángulo con los datos introducidos");
        }       
      }
    }
  


