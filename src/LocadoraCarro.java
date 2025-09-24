
import java.util.Scanner;
public class LocadoraCarro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //A locadora de carros precisa da sua ajuda para cobrar seus serviços.
        //Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado
        //e a quantidade de dias pelos quais ele foi alugado.
        //Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado


        double diaria = 0;
        double km = 0;

        System.out.println("Digite quantos dias ficou com o carro:");
        diaria = scan.nextDouble();
        System.out.println("Digite a quilometragem total percorrida:");
        km = scan.nextDouble();

        double precodiaria = diaria*90;
        double precokm = km*0.20;
        double total = precodiaria+precokm;

        System.out.printf("Foram %f dias e %.2fkms rodados. O valor total do aluguel é de %.2f.", diaria, km, total );



    }

}
