import java.util.Scanner;

public class CalculadoraEncadeados {
    public static int subtrairNumeros(int x,int y){
        return x-y;
    }
    public static void imprimirResultado(int x, int y){

        System.out.println("Resoltado da subtração: "+subtrairNumeros(x,y));
    }
    public static void main(String[] args){
        int x;
        int y;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        x = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        y = leitor.nextInt();

        imprimirResultado(x,y);

    }
}


//Objetivo: Fazer com que diferentes métodos comuniquem entre si, retirando do main a
// responsabilidade de fazer cálculos matemáticos e impressões diretas.
//
//Regras de Negócio:
//Crie um método chamado subtrairNumeros que receba dois inteiros (x e y) e retorne o resultado da subtração (x - y).
//Crie um segundo método chamado imprimirResultado (void) que receba o valor calculado e imprima: "O resultado da operação é: [valor]".
//O main deve ler dois números, chamar o método de subtração, e passar o resultado diretamente para o método de impressão.
