/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p13;
import java.util.Scanner;

/**
 *
 * @author osiri
 */
public class PP2P13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        int [] v = new int [30];
        int r, s, t;
        //Procesos
        v = llenarvector (v);
        r = promedio (v);
        //Se determina si el numero es mayor o menor al promedio
        s = uppromedio (v,r);
        t = downpromedio (v,r);
        mostrar (s,t);
    }
    public static int [] llenarvector(int[]v){//mientras i sea menor al tamaño de la posicion
        int i=0;
        Scanner teclado=new Scanner(System.in);
        while (i<v.length){
            System.out.println("Introduce un numero para la posicion "+i);
            v[i]=teclado.nextInt();
            i++;
        }
        return v;
    }
    public static int promedio (int[]v){
        //Se saca el promedio del grupo
        return (v[0] + v[1] + v[2] + v[3] + v[4] + v[5] + v[6] + v[7] + v[8] + v[9] + v[10] + v[11] + v[12] + v[13] + v[14] + v[15] + v[16] + v[17] + v[18] + v[19] + v[20] + v[21] + v[22] + v[23] + v[24] + v[25] + v[26] + v[27] + v[28] + v[29]) / v.length;
    }
    public static int uppromedio (int[]v,int r){
        int s;
        s = 0;
        for (int k = 0; k < v.length; k++){
            if (v[k] > r){
                s = s + 1;
            }
            }
        return s;
    }
    public static int downpromedio (int[]v,int r){
        int s;
        s = 0;
        for (int k = 0; k < v.length; k++){
            if (v[k] < r){
                s = s + 1;
            }
        }
        return s;
    }
    public static void mostrar (int a,int b){
        System.out.println("el numero de cifras que esta arriba del promedio es "+a);
        System.out.println("el numero de cifras que esta abajo del promedio es "+b);
    }    
}
