import java.util.Scanner;

public class CalculadoradeMedia {
        public static void main(String[] args) {
            double nota1;
            double nota2;
            double nota3;
            double media;
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite a primeira nota: ");
            nota1 = leitor.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = leitor.nextDouble();
            System.out.println("Digite a terceira nota: ");
            nota3 = leitor.nextDouble();

            media = (nota1+nota2+nota3)/3;

            if (media>=7){
                System.out.println("Aprovado!");
                return;
            } else if (media>=5 && media<7) {
                System.out.println("Recuperação.");
                return;
            }else {
                System.out.println("Reprovado.");
            }

        }
}
//Objetivo: Desenvolver um programa que declare três variáveis do tipo decimal (double) representando as notas de um aluno.
// O programa deve calcular a média aritmética e exibir o estado académico do aluno.
//Regras de Negócio:
//Média maior ou igual a 7.0: "Aprovado!"
//Média entre 5.0 e 6.9: "Em Recuperação."
//Média menor que 5.0: "Reprovado."