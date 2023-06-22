package projetoescola;

import java.util.Scanner;

public class Funcionario {

    public String nome;
    public String cargo;
    public int idade;
    public double salario;
    public double cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public void menuFuncionario(Scanner scanner) {
        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        System.out.println("Qual cargo você ocupa: ");
        cargo = scanner.next();
        System.out.println("Qual a sua idade? ");
        idade = scanner.nextInt();
        System.out.println("Qual seu salário? ");
        salario = scanner.nextDouble();
        System.out.println("Informe seu cpf: ");
        cpf = scanner.nextDouble();
    }
}
