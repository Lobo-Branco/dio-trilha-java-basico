import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner Resposta = new Scanner(System.in);

        // Solicita ao usuário a agência
        System.out.println("Seja Bem vindo ao banco teste! \n Por favor, digite o numero da Agencia ! ");
        int Agencia = Resposta.nextInt();

        // Enquanto a agência não for 1994, solicita ao usuário para digitar novamente
        while (Agencia != 1994) {
            System.out.println("Agencia não localizada, verifique e tente novamente! ");
            System.out.println("Seja Bem vindo ao banco teste! \n Por favor, digite o numero da Agencia ! ");
            Agencia = Resposta.nextInt();
        }

        // Solicita ao usuário a senha
        System.out.println("Agora insira a sua Senha: ");
        int senha = Resposta.nextInt();

        // Contador de tentativas de senha
        int tentativas = 0;

        // Enquanto a senha não for correta ou o usuário não atingir 3 tentativas, solicita ao usuário para digitar novamente
        while (senha != 12345 && tentativas < 3) {
            System.out.println("Senha incorreta, tente novamente! ");
            senha = Resposta.nextInt();
            tentativas++;
        }

        // Se o usuário atingir 3 tentativas, retorna ao início
        if (tentativas == 3) {
            System.out.println("Você excedeu o limite de tentativas, por favor, tente novamente mais tarde.");
            System.exit(0);
        }

        // Exibe as informações da conta
        System.out.println("Bem vindo Bruno! ");
        System.out.println("Agencia: 1994");
        System.out.println("Conta: 1234-5678-9012-3456");
        System.out.println("Saldo disponivel: R$ 1235.57");
    }
}