package Patika_Case;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Calisanın Adını Soyadını Giriniz:  ");
        String name = scan.nextLine();
        System.out.println(name);

        //maas
        System.out.println("Lutfen calisanin maaşini giriniz:   ");
        double salary = scan.nextDouble();
        System.out.println(salary);


        System.out.println("Lutfen Haftalik Calisma Saatini giriniz:  ");
        double workhours = scan.nextDouble();
        System.out.println(workhours);


        System.out.println("Lutfen ise baslangıc yılını giriniz: ");
        int hireYear = scan.nextInt();
        System.out.println(hireYear);

        if (workhours >= 40) {
            double bonus = 0;
            bonus = bonus + (30 * (workhours - 40));
            System.out.println("Calisma saatinden dolayi bonus:  " + bonus);


            double raiseSalary = 0;
            raiseSalary = raiseSalary + bonus;
            int startingYear = 0;
            startingYear = 2021 - hireYear;

            if (10 >= startingYear) {
                System.out.println("Ise baslama yili 10'dan kucuk oldugu icin %5 zam yapılmiştir. ");
                raiseSalary = raiseSalary + (salary * (1.05));
                System.out.println(raiseSalary);
            } else if (startingYear > 9 && startingYear < 20) {
                raiseSalary = raiseSalary + (salary * (1.10));
                System.out.println("Ise baslama yili 10'dan buyuk oldugu icin %10 zam yapilmistir:  ");
                System.out.println(raiseSalary);
            } else {
                System.out.println("Ise baslama yılı 20'den buyuk oldugundan %15 zam yapilmistir. ");
                raiseSalary = raiseSalary + (salary * (1.15));
                System.out.println(raiseSalary);

            }

            if (raiseSalary <= 1000) {
                System.out.println("1000 TL'den kucuk oldugu icin vergi uygulanmamistir. " + raiseSalary);
            } else {
                System.out.println("Maas 1000 TL'den buyuk oldugundan %3 vergi kesilmistir. ");
                System.out.println("Vergi miktarı: " + raiseSalary * (0.03) );


                System.out.println("Calısanın adı: " + name);
                System.out.println("Haftalık Calısma Saati: " + workhours);
                System.out.println("Calısanın ham maasi: " + salary);
                System.out.println("Calisanin ikramiyeli maasi: " + raiseSalary);
                System.out.println("Calisanin vergi sonrasi maasi:   " + raiseSalary * (0.97));
                System.out.println("Calisanin kac yildir hizmet verdigi: " + startingYear);


            }
        }
    }
}