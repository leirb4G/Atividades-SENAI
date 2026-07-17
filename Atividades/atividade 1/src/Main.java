import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        String altura;
        String cargo;
        String periodo;



        System.out.println("Formulário atividade 1");

        System.out.println("Qual seu nome?");
        nome = leitor.nextLine();
        System.out.println("Qual sua altura?");
        altura = leitor.nextLine();
        System.out.println("Qual seu cargo?");
        cargo = leitor.nextLine();
        System.out.println("Qual seu peíodo?");
        periodo = leitor.nextLine();


        System.out.println("Nome: "+nome+"\nAltura: "+altura+"\nCargo: "+cargo+"\nPeríodo: "+periodo);
    }
}

//Qual o seu nome?
//Joao
//Qual o sua altura?
//1.83
//Qual o seu cargo?
//Professor
//Qual o período você trabalha?
//Noturno
//
//Suas informações:
//Nome: Joao
//Altura: 1.83
//Cargo: Professor
//Período: Noturno