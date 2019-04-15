package br.com.gwsistemas.swiftcar.vendedor;

import br.com.gwsistemas.swiftcar.objetos.Endereco;
import java.util.Date;

/**
 *
 * @author mateus
 */
public class Vendedor {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String email;
    private String telefone;
    private String celularPrincipal;
    private String celularSecundario;
    private Date dataNascimento;
    private int idade;
    private Endereco endereco;
//    ACESSO
    private String login;
    private String senha;
    private String dataUltimoLogin;
    
    public Vendedor() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelularPrincipal() {
        return celularPrincipal;
    }

    public void setCelularPrincipal(String celularPrincipal) {
        this.celularPrincipal = celularPrincipal;
    }

    public String getCelularSecundario() {
        return celularSecundario;
    }

    public void setCelularSecundario(String celularSecundario) {
        this.celularSecundario = celularSecundario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataUltimoLogin() {
        return dataUltimoLogin;
    }

    public void setDataUltimoLogin(String dataUltimoLogin) {
        this.dataUltimoLogin = dataUltimoLogin;
    }
    
}
