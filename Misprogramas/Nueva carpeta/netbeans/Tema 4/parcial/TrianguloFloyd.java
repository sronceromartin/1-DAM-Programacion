/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;
public class TrianguloFloyd {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        int i,j,triangulo=0;
        for(i=1;i<=num;i++){
            for(j=1;j<=i;j++){
                triangulo++;
                System.out.print(" "+ triangulo);
            }
            System.out.println(" ");
        }
    }
}
