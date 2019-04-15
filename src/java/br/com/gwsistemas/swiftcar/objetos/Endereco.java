package br.com.gwsistemas.swiftcar.objetos;

import java.io.Serializable;

/**
 *
 * @author mateus
 */
public class Endereco implements Serializable{
    
    private int id;
    private String logradouro;
    private String numeroLogradouro;
    private String cidade;
    private String bairro;
    private String complemento;
    private String cep;

    public Endereco(int id, String logradouro, String numeroLogradouro, String cidade, String bairro, String complemento, String cep) {
        this.id = id;
        this.logradouro = logradouro;
        this.numeroLogradouro = numeroLogradouro;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
    }
    
    public Endereco(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(String numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
