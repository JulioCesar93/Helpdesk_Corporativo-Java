package com.jcs.helpdesk.domain.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jcs.helpdesk.domain.RegistroDeOcorrencia;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

public class RegistroDeOcorrenciaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAbertura = LocalDate.now();

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFechamento;

    @NotNull(message = "O campo PRIORIDADE é requerido")
    private Integer prioridade;

    @NotNull(message = "O campo STATUS é requerido")
    private Integer status;

    @NotNull(message = "O campo TITULO é requerido")
    private String titulo;

    @NotNull(message = "O campo OBSERVAÇÕES é requerido")
    private String observacoes;

    @NotNull(message = "O campo ANALISTA é requerido")
    private Integer analista;

    @NotNull(message = "O campo ASSOCIADO é requerido")
    private Integer associado;

    private String nomeAnalista;
    private String nomeAssociado;

    public RegistroDeOcorrenciaDTO() {
        super();
    }

    public RegistroDeOcorrenciaDTO(RegistroDeOcorrencia obj) {
        this.id = obj.getId();
        this.dataAbertura = obj.getDataAbertura();
        this.dataFechamento = obj.getDataFechamento();
        this.prioridade = obj.getPrioridade().getCodigo();
        this.status = obj.getStatus().getCodigo();
        this.titulo = obj.getTitulo();
        this.observacoes = obj.getObservacoes();
        this.analista = obj.getAnalista().getId();
        this.associado = obj.getAssociado().getId();
        this.nomeAssociado = obj.getAssociado().getNome();
        this.nomeAnalista = obj.getAnalista().getNome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Integer getAnalista() {
        return analista;
    }

    public void setAnalista(Integer analista) {
        this.analista = analista;
    }

    public Integer getAssociado() {
        return associado;
    }

    public void setAssociado(Integer associado) {
        this.associado = associado;
    }

    public String getNomeAnalista() {
        return nomeAnalista;
    }

    public void setNomeAnalista(String nomeAnalista) {
        this.nomeAnalista = nomeAnalista;
    }

    public String getNomeAssociado() {
        return nomeAssociado;
    }

    public void setNomeAssociado(String nomeAssociado) {
        this.nomeAssociado = nomeAssociado;
    }

}


