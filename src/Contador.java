import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner parametro = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int variavel1 = parametro.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int variavel2 = parametro.nextInt();
        parametro.close();
        
        if(variavel1 < variavel2){
            int sub = variavel2 - variavel1;
            
            for(int cont = 1; cont <= sub; cont++){
            System.out.println(cont);
            }
        }
        else{
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
       
    }
}