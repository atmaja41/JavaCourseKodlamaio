
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author matma
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("1. sayi");
        int sayi1 = klavye.nextInt();
        System.out.println("2. sayi");
        int sayi2 = klavye.nextInt();
        System.out.println("Obebi: " + obeb1(sayi1, sayi2));
    }

    public static int obeb1(int n1, int n2) {
        int obebi = 1;
        int bolen = 1;
        while (bolen <= n1 && bolen <= n2) {
            if (n1 % bolen == 0 && n2 % bolen == 0) {
                obebi = bolen;
            }
            bolen++;
        }
        return obebi;
    }
}
