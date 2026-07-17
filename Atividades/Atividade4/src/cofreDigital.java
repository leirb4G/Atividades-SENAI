import java.util.Scanner;

public class cofreDigital {
    public static void abrirCofre(int senha){
        int senhaCorreta = 4444;
        Scanner leitor = new Scanner(System.in);

        for(int i=0; i<=5;) {
            i++;

            if(i==6){
                System.out.println("Número máximo de tentativas alcançado. Cofre bloqueado");
                break;
            }

            if (senha == senhaCorreta) {
                System.out.println("Senha correta, cofre liberado");
                break;
            }else {
                System.out.println("Código errado, tentativa "+i+". Com 5 tentativas o cofre será bloqueado. \nDigite a próxima senha:");
                senha = leitor.nextInt();
            }
        }

    }
    public static void main (String[] args){
        int senha;
        Scanner leitor = new Scanner(System.in);


        System.out.println("Bem vindo ao cofre. Por favor digite sua senha.");
        senha = leitor.nextInt();

        abrirCofre(senha);

    }
}
//Objetivo: Criar um programa que simule o bloqueio de um cofre, utilizando o
//laço while para dar múltiplas tentativas ao utilizador.
//Regras de Negócio:
//Crie um método chamado abrirCofre que contenha um laço de repetição while.
//O cofre só abre se o utilizador digitar o código 9999.
//O utilizador tem no máximo 5 tentativas.
//Se acertar, imprima "Cofre Aberto!". Se errar, imprima "Código Errado" e
// mostre quantas tentativas restam. Se acabarem as tentativas, imprima "Cofre Bloqueado!".