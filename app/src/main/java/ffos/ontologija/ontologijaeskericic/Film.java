package ffos.ontologija.ontologijaeskericic;

import java.io.Serializable;

public class Film implements Serializable {

    private int sifra;

    private String film;

    private String zanr;

    private String mjesto;

    private String nastao;

    private String prodaneKarte;

    private String vrijeme;

    public Film() {
        this.sifra = sifra;
        this.film = film;
        this.zanr = zanr;
        this.mjesto = mjesto;
        this.nastao = nastao;
        this.prodaneKarte = prodaneKarte;
        this.vrijeme = vrijeme;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getMjesto() {
        return mjesto;
    }

    public void setMjesto(String mjesto) {
        this.mjesto = mjesto;
    }

    public String getNastao() {
        return nastao;
    }

    public void setNastao(String nastao) {
        this.nastao = nastao;
    }

    public String getProdaneKarte() {
        return prodaneKarte;
    }

    public void setProdaneKarte(String prodaneKarte) {
        this.prodaneKarte = prodaneKarte;
    }

    public String getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(String vrijeme) {
        this.vrijeme = vrijeme;
    }

}
