import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int idade;
    Scanner leitor = new Scanner(System.in);



    System.out.println("Digite sua idade: ");
    idade = leitor.nextInt();

    if (idade<16){
        System.out.println("Não pode votar.");
        return;
    }
    if (idade ==16|| idade ==17 || idade >70){
        System.out.println("Voto facultativo.");
        return;
    }
    if(idade >= 18 && idade <70){
        System.out.println("Voto obrigatório.");
    }


    }
}

//Menor de 16 anos: "Não pode votar."
//Entre 16 e 17 anos, ou maior que 70 anos: "Voto facultativo."
//Entre 18 e 70 anos: "Voto obrigatório."