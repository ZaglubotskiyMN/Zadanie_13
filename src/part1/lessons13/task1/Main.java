package part1.lessons13.task1;

import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("D://Somedir2//products.txt"));
            //do {
            while (sc.hasNextLine() == true) {
                String s = sc.nextLine();
                //System.out.println(s);
                String s1 = sc.nextLine();
                double a = Double.parseDouble(s1);
                //System.out.print(a);
                //double i=Double.parseDouble(a);
                //System.out.println(a);
                String s2 = sc.nextLine();
                double b = Double.parseDouble(s2);
                //System.out.println(b);
                System.out.printf("Товар :%s \n Количество: %s \n Цена: %s \n", s, a, b);
                System.out.println("-------------------------");
                System.out.println("----------Чек------------");
                System.out.println("Товар:" + s + " " + "итоговая стоимость" + " " + (a * b));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
