import java.util.Scanner;

public class SaudacaoPersonalizada {
    public static void imprimirSaudacao (String nome){
        System.out.println("Olá," +nome+"! Bem-vindo(a) à nossa aula de métodos.\"\n" +
                "//");
    }
    public static void main(String[] args) {
         String nome;
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();

        imprimirSaudacao(nome);

    }
}


//Objetivo: Criar um programa que utilize um método sem retorno (void) para exibir uma mensagem de boas-vindas a um utilizador.
//
//Regras de Negócio:
//Crie um método chamado imprimirSaudacao que receba uma String nome como parâmetro.
//O método deve imprimir a frase: "Olá, [nome]! Bem-vindo(a) à nossa aula de métodos."
//No método main, utilize o Scanner para capturar o nome digitado pelo utilizador e chame o método imprimirSaudacao passando esse nome.