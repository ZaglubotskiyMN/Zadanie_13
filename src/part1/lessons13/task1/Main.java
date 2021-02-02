package part1.lessons13.task1;

import java.io.*;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(new File("D://Somedir2//Zadanie.txt.txt"));
		String s=sc.nextLine();
		//System.out.println(s);
		int a= sc.nextInt();
		//System.out.println(a);
		int b= sc.nextInt();
		//System.out.println(b);
		System.out.printf("Товар :%s \n Количество: %d \n Цена: %d \n",s,a,b);
		System.out.println("-------------------------");
		System.out.println("----------Чек------------");
		System.out.println("Товар:"+s+" "+"итоговая стоимость"+" "+(a*b));

	}catch (IOException e){
		System.out.println(e.getMessage());
	}
    }
}
