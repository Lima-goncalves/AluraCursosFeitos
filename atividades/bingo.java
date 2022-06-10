package entrega;
import java.util.Iterator;
import java.util.Scanner;
public class bingo {
public static void main(String[] args) {
	System.out.println("insira seu nome");
	Scanner entrada = new Scanner(System.in);
	String nome = entrada.nextLine();
	entrada.close();
	char[] vetnome = nome.toCharArray();
	char[] sobrnome = new char[20];
	int brek =0,i;
	for(i=(vetnome.length);i>=0;i--) {
		if(vetnome[i-1]==' ') {
			brek=i;
			break;
			
		}
	}
	int n = brek;
	for(i=((vetnome.length-1)-n);i>=0;i--) {
		sobrnome [i]=vetnome[brek];
		System.out.println((String.valueOf(vetnome[i]).toUpperCase()));
		brek++;
		}
	for(i=0;i<((vetnome.length-(vetnome.length-n)));i++) {
		if (i==0) {
			System.out.println(""+String.valueOf(vetnome[i]).toUpperCase()+".");
		}
		else if (vetnome[i-1]==' ') {
			System.out.println(" "+String.valueOf(vetnome[i]).toUpperCase()+".");
		}
	}
}
}
