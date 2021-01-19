package model;


import javax.persistence.*;

@Entity
@Table(name = "Znamenitosti")
public class Znamenitost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Naziv")
    private String naziv;
    @Column(name = "Opis")
    private String opis;
    @Column(name = "Latitude")
    private double latitude;
    @Column(name = "Longitude")
    private double longitude;
    public Znamenitost(){}
    public Znamenitost(String naziv, String opis, double latitude, double longitude) {
        this.naziv = naziv;
        this.opis = opis;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public Long getId(){ return id; }

    public void setId(long Id){ this.id=Id; }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}