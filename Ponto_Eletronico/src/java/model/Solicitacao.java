/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author Usuario
 */
public class Solicitacao {
    Integer id;
    Integer tipoSolicitacao;
    String nomeSolicitante;
    String Aprovador;
    Long Etapa;
    Long qtddias;
    Timestamp dataInicio;
    Timestamp dataFim;
    Timestamp horaEntrada;
    Timestamp horaInicioAlmoco;
    Timestamp horaFimAlmoco;
    Timestamp horaSaida;
    String obs;
    Boolean aprovado;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTipoSolicitacao() {
        return tipoSolicitacao;
    }

    public void setTipoSolicitacao(Integer tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }

    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    public String getAprovador() {
        return Aprovador;
    }

    public void setAprovador(String Aprovador) {
        this.Aprovador = Aprovador;
    }

    public Long getEtapa() {
        return Etapa;
    }

    public void setEtapa(Long Etapa) {
        this.Etapa = Etapa;
    }
    
        public Long getQtddias() {
        return qtddias;
    }

    public void setQtddias(Long qtddias) {
        this.qtddias = qtddias;
    }

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Timestamp dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Timestamp getDataFim() {
        return dataFim;
    }

    public void setDataFim(Timestamp dataFim) {
        this.dataFim = dataFim;
    }

    public Timestamp getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Timestamp horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Timestamp getHoraInicioAlmoco() {
        return horaInicioAlmoco;
    }

    public void setHoraInicioAlmoco(Timestamp horaInicioAlmoco) {
        this.horaInicioAlmoco = horaInicioAlmoco;
    }

    public Timestamp getHoraFimAlmoco() {
        return horaFimAlmoco;
    }

    public void setHoraFimAlmoco(Timestamp horaFimAlmoco) {
        this.horaFimAlmoco = horaFimAlmoco;
    }

    public Timestamp getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Timestamp horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    
}
