package pack;
import java.util.Scanner;

public class fibo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int z=0;
		int a=1;
		int aux;
		int cont=2;
		int N;
		Scanner S=new Scanner(System.in);
		System.out.println("ingrese la cantidad de numeros fibonacci");
		N=S.nextInt();
		if(N==0){
			System.out.println("ingrese un numero valido");
		}
		else{
			if(N==1){
				System.out.println("la secuencia es:");
				System.out.println(z);
			}
			else{
				if(N==2){
					System.out.println("la secuencia es:");
					System.out.println(z+a);
				}
				else{
					System.out.println("la secuencia es:");
					System.out.println(z+a);
					while(cont<=N){
						aux=a+z;
						z=a;
						a=aux;
						cont=cont+1;
						System.out.println(a);
					}
				}
				
			}
			
		}

	}

}
