import java.util.Scanner;

public class CaixadeLoja {
    public static void main(String[] args) {
        double valorCompra;
        double desconto = 0;
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite o valor da compra:");
        valorCompra = leitor.nextDouble();

        if (valorCompra<100){
            System.out.println("Valor original: "+valorCompra+ "\nValor economizado: "+valorCompra*desconto+"\nValor final: "+valorCompra*(1-desconto));
            return;
        } else if (valorCompra<300) {
            desconto=0.1;
            System.out.println("Valor original: "+valorCompra+ "\nValor economizado: "+valorCompra*desconto+"\nValor final: "+valorCompra*(1-desconto));
            return;
        }else {
            desconto=0.2;
            System.out.println("Valor original: "+valorCompra+ "\nValor economizado: "+valorCompra*desconto+"\nValor final: "+valorCompra*(1-desconto));
            return;
        }

    }
}

//Objetivo: Simular o sistema de faturação de uma loja. O programa deve declarar uma variável double valorCompra.
// Aplique um desconto progressivo baseado no valor total e exiba o valor original,
// o valor poupado com o desconto e o montante final a pagar.
//Faixas de Desconto:
//Compras abaixo de R$ 100,00: Sem desconto (0%).
//Compras de R$ 100,00 até R$ 299,99: 10% de desconto.
//Compras de R$ 300,00 ou mais: 20% de desconto.