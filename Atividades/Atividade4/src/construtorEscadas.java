import java.util.Scanner;

public class construtorEscadas {
    public static void DesenhaEscada(int degraus, char simbulo){
        int i = 1;
        int i2;

        while(i<=degraus){
            i2=1;

            while (i2 <i){
                System.out.print(simbulo);
            i2++;
            }
            System.out.println(simbulo);
            i++;
        }

    }

    public static void main (String[] args){
        int degraus;
        char simbulo;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus:");
        degraus = leitor.nextInt();
        System.out.println("Digite o simbulo que será usado:");
        simbulo = leitor.next().charAt(0);

        DesenhaEscada(degraus,simbulo);
    }
}


//Objetivo: Praticar o uso de laços for aninhados (um dentro do outro) para criar formas geométricas assimétricas.
//Regras de Negócio:
//Baseado no GeradorDeFormas visto em aula, crie um método desenharEscada que receba um int degraus e um char simbolo.
//O laço externo (eixo Y) deve controlar o número de linhas (degraus).
//O laço interno (eixo X) deve imprimir o símbolo repetidas vezes,
//mas a quantidade de símbolos em cada linha deve ser igual ao número da linha atual.