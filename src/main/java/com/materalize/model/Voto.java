package com.materalize.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Voto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long codigo;
    private  String lejardin;
    private  String evian;
    private  String olimpia;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getLejardin() {
        return lejardin;
    }

    public void setLejardin(String lejardin) {
        this.lejardin = lejardin;
    }

    public String getEvian() {
        return evian;
    }

    public void setEvian(String evian) {
        this.evian = evian;
    }

    public String getOlimpia() {
        return olimpia;
    }

    public void setOlimpia(String olimpia) {
        this.olimpia = olimpia;
    }
}
