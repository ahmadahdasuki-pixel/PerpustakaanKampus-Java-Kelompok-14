/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemperpustakaan.model;

/**
 *
 * @author Ahmad Ahdasuki
 */
public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private String kategori;

    public Buku(int id, String judul, String penulis, String kategori) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getKategori() {
        return kategori;
    }

    public void tampilkan() {
        System.out.println("ID       : " + id);
        System.out.println("Judul    : " + judul);
        System.out.println("Penulis  : " + penulis);
        System.out.println("Kategori : " + kategori);
    }
}