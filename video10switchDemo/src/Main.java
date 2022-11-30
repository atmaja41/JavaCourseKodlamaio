/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author matma
 */
public class Main {

    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok güzel geçtiniz.");
                break;
            case 'C':
                System.out.println("İyi geçtiniz.");
                break;
            case 'D':
                System.out.println("Fena değil geçtiniz.");
                break;
            case 'F':
                System.out.println("Malesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }

}
