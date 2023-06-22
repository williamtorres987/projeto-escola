package projetoescola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CronogramaAlimentarCantina cardapio = new CronogramaAlimentarCantina();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Escolha uma opçao:  ");
            System.out.println("1. Professor ");
            System.out.println("2. Aluno");
            System.out.println("3. Funcionario");
            System.out.println("4. Cardapio da escola");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    professor.menuProfessor(scanner);
                    break;
                case 2:
                    aluno.menuAluno(scanner);

                    break;
                case 3:
                    funcionario.menuFuncionario(scanner);
                    break;
                case 4:
                    cardapio.avisoCardapioePrecos();
                    cardapio.pedidosCantina(scanner);
                    break;
                default:
                    System.out.println("Digite uma opcao valida!");
            }

        }while(opcao!=0);
    }
}

