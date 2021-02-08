package part1.lessons13.task1;

import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("D://Somedir2//products.txt"));
            do {
                String s = sc.nextLine();
                //System.out.println(s);
                double a = Double.parseDouble(sc.next());
                //System.out.print(a);
                //double i=Double.parseDouble(a);
                //System.out.println(a);
                double b = Double.parseDouble(sc.next());
                //System.out.println(b);
                System.out.printf("Товар :%s \n Количество: %s \n Цена: %s \n", s, a, b);
                System.out.println("-------------------------");
                System.out.println("----------Чек------------");
                System.out.println("Товар:" + s + " " + "итоговая стоимость" + " " + (a * b));
            }while (sc.hasNext() == true);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
