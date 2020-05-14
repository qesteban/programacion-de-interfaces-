import java.util.Scanner;
public class prueba {

public static void main (String[] args) {

    Scanner read = new Scanner (System.in);
    int Option ;

    int opcion;
    do{
    System .out.println("**********menu de opciones***********");
    System .out.println("1- ingrese vector");
    System .out.println("2- ingrese valor del vector");
    System .out.println("3- imprimir vector");
    System .out.println("4- salir");

    Option=read.nextInt();
    int variable1 , variable2 , variable3 , variable4;

    switch (Option)
    {
        case 1:
            System .out.println("vector ingresado");
            variable1=read.nextInt();
            break;

        case 2:
        System .out.println("valor agregado presione cualquier numero para regresar al menu");
        variable2=read.nextInt();
        break;

        case 3:

        System .out.println("vector impreso presione cualquier numero para regresar al menu");
        variable3=read.nextInt();

        break;

        case 4:
        System .out.println("gracias por su visita vuelva pronto ");
        variable4=read.nextInt();



    }
    }while(Option !=4);

}

}
