  
package br.edu.infnet.domain.model;

import javax.persistence.Entity;

@Entity
public class Empresa extends Usuario {

    private String cnpj;
    private String razaoSocial;

    public Empresa() {
        super();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}