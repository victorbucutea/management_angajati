package com.victortoader.angajati.client.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Vic on 3/5/2016.
 */
@XmlRootElement
public class EmployeeJAXB {
    String nume;
    String prenume;
    int salariu;
    String adresa;
    byte[] poza;
    int id;

    public String getNume() {
        return nume;
    }

    @XmlElement
    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    @XmlElement
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getSalariu() {
        return salariu;
    }

    @XmlElement
    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public String getAdresa() {
        return adresa;
    }

    @XmlElement
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public byte[] getPoza() {
        return poza;
    }

    @XmlElement
    public void setPoza(byte[] poza) {
        this.poza = poza;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }
}
