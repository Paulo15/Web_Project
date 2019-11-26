
import java.security.Timestamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe.correia
 */
public class LacamentoHoras {
    
    private int id;
    private Long numberProcesso;
    private Timestamp horaEntrada;
    private Timestamp horaAlmocoInicio;
    private Timestamp horaAlmocoFim;
    private Timestamp horaSaida;
    private String login;
    private String nome;
    private String gestorAprovador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getNumberProcesso() {
        return numberProcesso;
    }

    public void setNumberProcesso(Long numberProcesso) {
        this.numberProcesso = numberProcesso;
    }

    public Timestamp getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Timestamp horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Timestamp getHoraAlmocoInicio() {
        return horaAlmocoInicio;
    }

    public void setHoraAlmocoInicio(Timestamp horaAlmocoInicio) {
        this.horaAlmocoInicio = horaAlmocoInicio;
    }

    public Timestamp getHoraAlmocoFim() {
        return horaAlmocoFim;
    }

    public void setHoraAlmocoFim(Timestamp horaAlmocoFim) {
        this.horaAlmocoFim = horaAlmocoFim;
    }

    public Timestamp getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Timestamp horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGestorAprovador() {
        return gestorAprovador;
    }

    public void setGestorAprovador(String gestorAprovador) {
        this.gestorAprovador = gestorAprovador;
    }
    
    
    
}
