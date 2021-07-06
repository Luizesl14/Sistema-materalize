package com.materalize.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class EventoVotar implements Serializable {

    private  static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long codigo;


    private  String empreendimento;
    private  String voto;

    @OneToOne
    private  EventoCadastro eventoCadastro;


    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getEmpreendimento() {
        return empreendimento;
    }

    public void setEmpreendimento(String empreendimento) {
        this.empreendimento = empreendimento;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }


}
