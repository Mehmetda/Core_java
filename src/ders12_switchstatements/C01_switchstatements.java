package ders12_switchstatements;

import java.util.Scanner;

public class C01_switchstatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir gün no giriniz :");
        int günno=scan.nextInt();
        switch (günno){
            case 1 :
                System.out.println("pazartesi"); break;
            case 2 :
                System.out.println("salı"); break;
            case 3 :
                System.out.println("çarşamba"); break;
            case 4:
                System.out.println("perşembe");break;
            case 5:
                System.out.println("cuma");break;
            case 6 :
                System.out.println("cumartesi");break;
            case 7 :
                System.out.println("pazar");break;
            default:
                System.out.println("geçersiz gün numarası");
        }
    }
}
