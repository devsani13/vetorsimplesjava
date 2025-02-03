package aula.pkg8;

import java.util.Scanner;

public class Aula8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[12];
        int i;
        for(i=0;i<=11;i++) {
            System.out.print("Digite o "+(i+1)+" número: ");
            num[i] = sc.nextInt();
        }
        for(i=0;i<=11;i++) {
            System.out.println("Índice: "+(i+1)+" número: "+num[i]);
        }
    }
    
}
