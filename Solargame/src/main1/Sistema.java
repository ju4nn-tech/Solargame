package main1;
import java.util.Scanner;
import java.util.Random;
public class Sistema {


	public static void main(String[]args) {
Scanner sc=new Scanner(System.in);

System.out.println("Bienvenido a solar game, ingrese la mision que desee jugar.");
System.out.println("1. Luna");
System.out.println("2. Marte ");
System.out.println("3. Venus ");
System.out.println("4. Jupiter");
System.out.println("5. Sol");
int sel1=sc.nextInt();
switch (sel1) {
case 1:
luna.iniciar();
case 2:
case 3:
case 4:
case 5:
}
sc.close();
	}
}