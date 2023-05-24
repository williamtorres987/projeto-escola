package projetoescola;

import java.util.Scanner;

public class Aluno {

  private String nome;
  private double idade;
  private double cpf;
  private double matricula;
  private double notaum;
  private double notadois;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getIdade() {
    return idade;
  }

  public void setIdade(double idade) {
    this.idade = idade;
  }

  public double getCpf() {
    return cpf;
  }

  public void setCpf(double cpf) {
    this.cpf = cpf;
  }

  public double getMatricula() {
    return matricula;
  }

  public void setMatricula(double matricula) {
    this.matricula = matricula;
  }

  public double getNotaum() {
    return notaum;
  }

  public void setNotaum(double notaum) {
    this.notaum = notaum;
  }

  public double getNotadois() {
    return notadois;
  }

  public void setNotadois(double notadois) {
    this.notadois = notadois;
  }

  public void setNotaum(int notaum) {
    this.notaum = notaum;
  }


  public void setNotadois(int notadois) {
    this.notadois = notadois;
  }
}
