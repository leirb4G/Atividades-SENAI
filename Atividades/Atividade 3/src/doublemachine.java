import java.util.Scanner;

public class doublemachine {

    public static int calculaDobro(int numero){
        int dobro = numero * 2;
        return dobro;
    }

    public static void main(String[] args){
        int numero;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu numero:");
        numero = leitor.nextInt();




        System.out.println("Numero dobrado: "+calculaDobro(numero));



    }
}

//Objetivo:
//Desenvolver um programa que utilize um método com retorno de valor numérico para calcular o dobro de um número fornecido.
//Regras de Negócio:
//Crie um método chamado calcularDobro que receba um int numero como parâmetro e retorne (return) o dobro desse valor.
//O método main deve pedir ao utilizador para digitar um número via Scanner.
//O resultado retornado pelo método deve ser armazenado numa variável no main e impresso na consola.