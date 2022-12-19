package br.com.ada.adaflix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity

public class Evento {
    @Id
    private Long id;
    private String cnpj;
    private String empresa;
    private String nome;
    private String descricao;
    private LocalDateTime data_hora;
    private String local;
    private Double preco;
    private Long capacidade;
    private LocalDateTime inicioVendas;
    private LocalDateTime fimVendas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Long getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Long capacidade) {
        this.capacidade = capacidade;
    }

    public LocalDateTime getInicioVendas() {
        return inicioVendas;
    }

    public void setInicioVendas(LocalDateTime inicioVendas) {
        this.inicioVendas = inicioVendas;
    }

    public LocalDateTime getFimVendas() {
        return fimVendas;
    }

    public void setFimVendas(LocalDateTime fimVendas) {
        this.fimVendas = fimVendas;
    }
}
