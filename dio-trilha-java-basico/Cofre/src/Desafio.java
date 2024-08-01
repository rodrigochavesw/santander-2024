import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = scanner.nextInt();
            int senhaCompara = scanner.nextInt();
            Cofre cofreDigital = new CofreDigital(senha);
            cofreDigital.imprimirInformacoes();

            if(senha != senhaCompara){
                System.out.println("Senha incorreta!");
            }else if (cofreDigital.metodoAbertura.equalsIgnoreCase("senha")) {
                 System.out.println("Cofre aberto!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            Cofre cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        } else System.out.println("Cofre aberto!");


    }
}