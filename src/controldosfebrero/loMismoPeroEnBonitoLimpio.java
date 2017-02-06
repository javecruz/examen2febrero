package controldosfebrero;

import java.util.Random;

public class loMismoPeroEnBonitoLimpio {
    
    
    public loMismoPeroEnBonitoLimpio(){
    
    loMismoPeroEnBonitoLimpio asdjkasdas = new loMismoPeroEnBonitoLimpio();
           
    
    }
    
    
    
    public static void main(String[] args) {
    
    
    
    int[][] matriz = crearMatriz();
    verDiagonalSecundaria(matriz);
    apartadoB(matriz);
    elementosConsecutivos(matriz);
    apartadoD(matriz);
    
    
    }
    
    
    
    
    
    
    
    
    
    public static int[][] crearMatriz() {
    
    int[][] matriz = new int[6][6];
        Random rng = new Random();

        // genera una matriz de 6x6 aleatoria y la visualiza
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                //genera numeros aleatorios a partir de 10 hasta 99
                matriz[i][j] = (int) (Math.random() * 90 + 10);
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println("\n");
        }

        System.out.println("\n\n");
    
    
    return matriz;
    }
    
    
    public static void verDiagonalSecundaria(int[][] matriz){
    
    
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i + j == 5) {

                    System.out.print(matriz[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println("\n");
        }

        System.out.println("\n");
    
    }
    
    
    
    public static void apartadoB (int[][] matriz){
    
    
    // Indica la columna con el mayor elemento
        int aux = 0;

        int col = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                // AUNQUE PAREZCO QUE NO, AUX SIEMPRE CAMBIARÁ DE VALOR EN EL PRIMER ELEMENTO QUE LEA DEL ARRAY, SI HAY DUDA, PREGUNTAME
                if (aux < matriz[i][j]) {

                    aux = matriz[i][j];
                    col = j;
                }

            }

        }
    
        // imprimo columna y AUNQUE NO LO PIDE, sólo para comprobar que esta todo bien, el número maximo
        System.out.println("EL número maximo es: " + aux);
        System.out.println("La columna donde se encuentra es: " + (col + 1) + " \nNOTA: La primera columna es la 1 y la última la 6, no empiezo desde la 0...");
    
    
    }
    
    
    public static void elementosConsecutivos(int[][] matriz){
    
    //Indica si en alguna fila hay al menos tres elementos consecutivos
        boolean sw = false;
        int fila = 0;
        int valor = 0;
        System.out.println("\n\n");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length - 2; j++) {

                if (((matriz[i][j] - (matriz[i][j + 2] + 2)) == 0 || ((matriz[i][j] + 2) - matriz[i][j + 2]) == 0) && (((matriz[i][j] + 1) == matriz[i][j + 1]) && ((matriz[i][j + 2] - 1) == matriz[i][j + 1]))) {

                    sw = true;
                    
                    fila = i;
                }

            }

        }
        
        if(sw==true){
            System.out.println("Hay elementos consecutivos en la fila " + fila);
        }

        System.out.println("\n\n");
    
    
    }
    
    
    
    public static void apartadoD(int[][] matriz){
    // creo un array con indice = al número de columnas del anterior
        int[] array = new int[matriz.length];

        int auxxx = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if(matriz[j][i]>auxxx){
                auxxx = matriz[j][i];
                
                }

            }
            array[i] = auxxx;
            auxxx = 0;
        }
    // imprimo antes de ordenar para ver si esta bien
        System.out.println("\n Array sin ordenar");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");

        }

        
        
        
        // ordeno array
        System.out.println("\nArray ordenado");
        int auxi = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                
                
                if (array[i] < array[j]) {
                    auxi = array[i];
                    array[i] = array[j];
                    array[j] = auxi;
                }
            }
            
        }

        // imprimo
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");

        }
    
    
    }
    
    
    
}
