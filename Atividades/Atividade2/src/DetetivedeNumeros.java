import java.util.Scanner;

public class DetetivedeNumeros {
    public static void main(String[] args) {
    int numero;
    Scanner leitor = new Scanner(System.in);


        System.out.println("Digite o número: ");
        numero = leitor.nextInt();


        if(numero>0){
            if (numero%2!=0) {
                System.out.println("O número é ímpar.");
            }else {
                System.out.println("O número é par.");
            }
            System.out.println("O número é positivo.");
        }else {
            if (numero%2!=0) {
                System.out.println("O número é ímpar.");
            }else {
                System.out.println("O número é par.");
            }
            System.out.println("O número é negativo.");
        }




    }
}
//Valor da Variável   ////// Saída Esperada na Consola
//-4 ////// O número é Par. O número é Negativo.
//7 //////O número é Ímpar. O número é Positivo.