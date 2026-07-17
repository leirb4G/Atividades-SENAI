import java.util.Scanner;

public class VerificaAcesso {
    public static boolean verifiarMaioridade (int idade){
        boolean retorno;

        if (idade>=18){
            retorno = true;
        }else {
            retorno = false;
        }
        return retorno;
    }
    public static void main(String[] args){
        int idade;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        if(verifiarMaioridade(idade)==true){
            System.out.println("Acesso Liberado");
        }else {
            System.out.println("Acesso negado");
        }


    }
}



//Objetivo: Criar um método que misture parâmetros, retorno de tipo booleano (boolean) e lógicas de condição (if/else),
// semelhante ao metodoDeComparacao visto em aula.
//Regras de Negócio:
//Crie um método chamado verificarMaioridade que receba uma idade (int) e retorne true se for maior ou igual a 18,
// e false caso contrário.
//No método main, peça a idade do utilizador usando o Scanner.
//A partir do retorno verdadeiro ou falso do método, o main deve usar um if/else para imprimir "Acesso Liberado" ou "Acesso Negado".
