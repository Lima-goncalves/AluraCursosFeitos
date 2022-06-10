package entrega;
import java.util.Scanner;
public class atv2 {


public static void main(String[] args) {
	int num = 0;
	int tentativa = 0;
	int i = 0;
	int j = 0;
	Scanner entrada = new Scanner(System.in);
	
       System.out.println("BINGO");
	    do{
	        if(tentativa!=0){
	        	 System.out.println ("\n**************\nERRO\n**************\n"); 
	        }
	        System.out.println("Informe um valor (1-500): ");
	        
	        num=entrada.nextInt();
	        
	        tentativa++;
	    }while  (num<1 || num>500);
	 
	    for(i=1,j=num;i<=num;i++,j--){
	        //coluna 1
	        if(i%4==0 && i%5==0){
	        	 System.out.println("BINGO\t\t");
	        }else{
	            if(i%4==0){
	            	 System.out.println("M4\t\t");
	            }else{
	                if(i%5==0){
	                	 System.out.println("M5\t\t");
	                }else{
	                	 System.out.println(i);     
	                }   
	            }   
	        }
	        
	        //coluna 2
	        if(j%4==0 && j%5==0){
	        	 System.out.println("BINGO\n");
	        }else{
	            if(j%4==0){
	            	 System.out.println("M4\n");
	            }else{
	                if(j%5==0){
	                	 System.out.println("M5\n");
	                }else{
	                	 System.out.println(j);       
	                }   
	            }   
	        }
	    }
	    

}
}
