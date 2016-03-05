package com.victortoader.angajati.client.model;

/**
 * Created by Vic on 3/5/2016.
 */
public class Employee {

    private String Nume;
    private String Prenume;
    private String Salariu;
    private String Adresa;
    private String URLPoza;

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public String getSalariu() {
        return Salariu;
    }

    public void setSalariu(String salariu) {
        Salariu = salariu;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setAdresa(String adresa) {
        Adresa = adresa;
    }

    public String getURLPoza() {
        return URLPoza;
    }

    public void setURLPoza(String URLPoza) {
        this.URLPoza = URLPoza;

    }

}