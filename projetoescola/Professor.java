package projetoescola;

import java.util.Scanner;

public class Professor extends Funcionario{
    private String materia;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void menuProfessor (Scanner scanner) {
        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        System.out.println("Qual matéria você leciona: ");
        materia = scanner.next();
        System.out.println("Qual a sua idade? ");
        idade = scanner.nextInt();
        System.out.println("Qual seu salário? ");
        salario = scanner.nextDouble();
        System.out.println("Informe seu cpf: ");
        cpf = scanner.nextDouble();
        System.out.println("Bem vindo (a)"+ nome + "sua matéria é "+ materia+ ". Aqui estão suas informações:");
        System.out.println( "idade: " + idade);
        System.out.println( "salário: " + salario);
        System.out.println( "cpf: " + cpf);
    }
}
