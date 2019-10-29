import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Algorithm algorithm = new Algorithm();
        Scanner s = new Scanner(System.in);
        Scanner opcao = new Scanner(System.in);
        int op;
        do {
            System.out.println("1 - Chegada");
            System.out.println("2 - Chamada");
            op = opcao.nextInt();
            if (op == 1) {
                System.out.println("Nome:");
                String nome = s.next();
                System.out.println("Idade:");
                int idade = s.nextInt();
                Customer customer = new Customer(nome, idade);
                algorithm.insert(customer);
                algorithm.fila();
            }
            if (op == 2){
                algorithm.sair();
            }
        }while (op != 0);
    }
}
