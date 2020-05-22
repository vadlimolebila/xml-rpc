package com.sb.molebila.domain;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 10꞉14 AM
 */
public class Mahasiswa {

    private int nim;
    private String nama;
    private String jurusan;

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
