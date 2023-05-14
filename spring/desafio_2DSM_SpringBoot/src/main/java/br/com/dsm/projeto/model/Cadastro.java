package br.com.dsm.projeto.model;

import lombok.Data;

@Data
public class Cadastro {

  // atributos

  private String nome;
  private String endereco;
  private String cpf;
  private String telefone;
  private String email;

  // getters e setters

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public void setcCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

}