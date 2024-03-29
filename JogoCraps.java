import java.util.Random;

public class JogoCraps {

    public static void main(String[] args) {
        Random gerador = new Random();

        int dadoUm = gerador.nextInt(6) + 1;
        int dadoDois = gerador.nextInt(6) + 1;
        int somaDados = dadoUm + dadoDois;
        int ponto = 0;

        System.out.println("Jogando os dados....");
        System.out.println(dadoUm);
        System.out.println(dadoDois);

        if (somaDados == 7 || somaDados == 11) {
            System.out.println("Total: " + somaDados + "\nnatural! você ganhou!!");
        } else if (somaDados == 2 || somaDados == 3 || somaDados == 12) {
            System.out.println("Total: " + somaDados + "\ncraps! você perdeu!");
        } else {
            System.out.println("Total: " + somaDados + "\nPonto!");
        }


    }
}
