import java.util.Scanner;

public class Tarefa {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double n1,n2,n3,n4;
        double media;

        System.out.println("Digite a nota 1:");
        n1 = ler.nextDouble();
        System.out.println("Digite a nota 2:");
        n2 = ler.nextDouble();
        System.out.println("Digite a nota 3:");
        n3 = ler.nextDouble();
        System.out.println("Digite a nota 4:");
        n4 = ler.nextDouble();

        media = (n1+n2+n3+n4)/4;
        System.out.println("A sua média é: " + media);
        if(media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
