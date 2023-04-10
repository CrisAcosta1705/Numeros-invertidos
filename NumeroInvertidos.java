package NumeroInvertidos;
import java.util.Scanner;
public class NumeroInvertidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner tc = new Scanner(System.in);
        
        // Pedimos al usuario que ingrese un número de tres cifras
        System.out.println("Ingrese un número de tres cifras:");
        int numero = tc.nextInt();
        
        // Separamos las cifras del número utilizando operaciones aritméticas
        int cifra1 = numero / 100;
        int cifra2 = (numero % 100) / 10;
        int cifra3 = numero % 10;
        
        // Imprimimos las cifras en orden inverso
        System.out.println("El número invertido es: " + cifra3 + cifra2 + cifra1);
        
        // Cerramos el objeto Scanner
        tc.close();
    }

}
	


