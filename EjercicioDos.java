import javax.swing.*;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

double area=Math.PI;
double radio;

System.out.println("ingrese el radio");

radio=sc.nextDouble();
area=area*radio*radio;

        System.out.println("El area del circulo es"+area);

        int a= 2;
        int b= 2;
        int c= 2;
        int d= 4;
        int e= 5;

        int resultado0 = a+b+c;
        int resultado1 = resultado0*d;
        int resultado2 = a-e;
        int resultado3 = resultado1/resultado2;
        System.out.println("el resultado de la operacion es "+resultado3);

        // explicacion de cast en metodos primitivos
          // El cast se resume en forzar al Ide a tranformar un numero muy grande para almacenarlo en una caja mas pequeñita teniendo en cuenta la
        // perdida de precision

        double y = 25.5;
        byte x = (byte)y;
        int m = 100;
        double n = 13.4;
        long u = 1582;
        short o = 450;
        m= (int)y;
        o= (short)u;
        {
        }

        System.out.println("el ejemplo de los cast son ejemplo 1 "+x+" el ejmplo 2 es "+m+" el ejemplo 3 es "+o);



    }
}