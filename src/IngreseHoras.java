import java.util.Scanner;

public class IngreseHoras {
    private final Scanner horas= new Scanner (System.in);
    int numero=obtenerNumeroNuevo();

    public int numero(){
        int obtenerNumero=obtenerNumeroNuevo();
        System.out.printf("El numero ingresado es: %d\n",obtenerNumero);
        return obtenerNumero;
    }

    private int obtenerNumeroNuevo(){
        System.out.println("Ingrese un numero entero:\n");
        return horas.nextInt();
    }

    public void semanas(){
        int sem;
        sem=numero/168;
        System.out.printf("Semanas: %s\n",sem);
    }

    public void dias(){
        int dias;
        dias=(numero%168)/24;
        System.out.printf("Dias: %s\n",dias);
    }

    public void horas(){
        int horas;
        horas=numero%24;
        System.out.printf("Horas: %s\n",horas);
    }

}
