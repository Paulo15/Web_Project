/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class Solicitacao {
    Integer tipoSolicitacao;
    String nomeSolicitante;
    String Aprovador;
    Long Etapa;
    
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
    
}
