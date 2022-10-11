import java.util.Scanner;
public class matriz2x3_v3 {
    public static void main(String [] arg){

        int filas = 2, columnas = 3; //DECLARAMOS EL TAMAÑO QUE TENDRA NUESTRA MATRIZ
        Scanner entrada = new Scanner(System.in);

        int numeros [][] = new int [filas][columnas]; //ojo: al ser matriz de 2x3 tendra filas y columnas

        //FOR PARA PEDIR DATOS (solo montrara el mensaje y almacenara por teclado)
        for(int j = 0; j < filas; j++){  //este bucle validara las filas
            System.out.println("VALORES DE LA FILA #" + (j+1));    //este mensaje va diferenciar la fila cuando terminemos de llenar cada fila
            for(int i = 0; i < columnas; i++){ //este bucle validara las columnas
                System.out.println("ingrese valor de la columna #" + (i+1));  //
                 numeros[j][i] = entrada.nextInt(); //almacenamos el valor ingresado por teclado
            }
        }

        //FOR PARA MOSTRAR LA MATRIZ (aqui muestra los datos leidos por el for anterior)
        for(int j = 0; j < filas; j++){   //estos dos bucles es exactamente el mismo que los anteriorires, lo unico que cambia es el contenido que mostrara los valores que ingresamos.
            for(int i = 0; i < columnas; i++){
                System.out.print("[" + numeros[j][i] + "]");  //llamamos los valores que almacenamos en los primeros bucles
            }
            System.out.println(""); //para saltar a la siguiente fila y darle forma a la matriz
        }

    }
}
