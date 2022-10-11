import java.util.Scanner;
public class matriz2x3_v2 {
    public static void main(String [] arg){

        int filas = 2, columnas = 3;
        int contador=1;
        //Scanner entrada = new Scanner(System.in);

        int numeros [][] = new int [filas][columnas];

        for(int j = 0; j < filas; j++){
            for(int i = 0; i < columnas; i++){

                numeros[j][i] = contador;
                contador++;
                System.out.print("[" + numeros[j][i] + "]");

               // System.out.println("ingrese valor");
                // contador = entrada.nextInt();
               // numeros[j][i] = contador;
                // System.out.print("[" + contador + "]");
            }
            System.out.println("");
        }
    }
}
