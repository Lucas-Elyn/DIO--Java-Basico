import java.util.Scanner;

public class AcessoConta {
    public static void main(String[] args) {
        //Importar classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir e solicitar informações ao usuário
        System.out.println("Digite seu nome: ");
        String nomeUsuario = sc.nextLine();

        System.out.println("Digite o número da conta: ");
        int conta = sc.nextInt();

        //Exibir resultado ao usuário
        System.out.println("Acesso a conta " + conta + " com sucesso!");
        System.out.println("Seja bem vindo(a) " + nomeUsuario);
        sc.close();
    }
}
