package Desafios_Intermediarios;
import java.util.Scanner;

public class Desafio02{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int desconto, precoAntigo;
        desconto = input.nextInt();
        precoAntigo = input.nextInt();
        
        int precoNovo = precoAntigo - (precoAntigo * desconto / 100);
        System.out.println(precoNovo);
	}
}