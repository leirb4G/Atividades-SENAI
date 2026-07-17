import java.util.Scanner;

public class CalculadoradeIMC {
    public static void main(String[] args) {
        double altura;
        double peso;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        altura = leitor.nextDouble();
        System.out.println("Digite seu peso:");
        peso = leitor.nextDouble();

        double imc = peso/(altura*altura);

        if(imc<18.85){
            System.out.println("Abaixo do peso.");
            return;
        } else if (imc<24.9) {
            System.out.println("Peso normal.");
            return;
        } else if (imc<29.9) {
            System.out.println("Sobrepeso");
            return;
        }else {
            System.out.println("Obesidade.");
        }


    }
}
//Objetivo: Declarar duas variáveis do tipo double (peso e altura), calcular o IMC utilizando a fórmula IMC = peso / (altura * altura)
// e classificar o resultado.
//Regras de Classificação:
//IMC menor que 18.5: "Abaixo do peso."
//IMC entre 18.5 e 24.9: "Peso normal."
//IMC entre 25.0 e 29.9: "Sobrepeso."
//IMC maior ou igual a 30.0: "Obesidade."