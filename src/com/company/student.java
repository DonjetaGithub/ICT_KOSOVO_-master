package com.company;

import java.time.LocalDate;

public class student {
    private String id;
    private String emri;
    private String mbiemri;
    private String ditelindja;
    private String fakulteti;
    private String drejtimi;
    private char gjinia;
    private int vitiiRegjistrimit;

    student(String id, String emri, String mbiemri, LocalDate ditelindja, String fakulteti, String drejtimi, char gjinia, int vitiiRegjistrimit1) {
        this.vitiiRegjistrimit = vitiiRegjistrimit1;
        this.setId(id);
        this.setEmri(emri);
        this.setMbiemri(mbiemri);
        this.setDitelindja(ditelindja);
        this.setFakulteti(fakulteti);
        this.setDrejtimi(drejtimi);
        this.setGjinia(gjinia);
    }

    public String getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public String getDitelindja() {
        return ditelindja;
    }

    public String getFakulteti() {
        return fakulteti;

    }

    public String getDrejtimi() {
        return drejtimi;
    }

    public char getGjinia() {
        return gjinia;
    }

    public int vitiiRegjistrimit() {
        return vitiiRegjistrimit;
    }

    private void setGjinia(char gjinia) {
        this.gjinia = gjinia;
    }

    private void setDrejtimi(String drejtimi) {
        this.drejtimi = drejtimi;
    }


    private void setFakulteti(String fakulteti) {
        this.fakulteti = fakulteti;
    }

    private void setDitelindja(LocalDate ditelindja) {
        this.ditelindja = mbiemri;
    }

    private void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    private void setEmri(String emri) {
        this.emri = emri;

    }

    private void setId(String id){
        this.id =  id;

    }
}