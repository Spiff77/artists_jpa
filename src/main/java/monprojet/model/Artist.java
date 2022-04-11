package monprojet.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String bandName;
    private int size;
    private String country;

    @OneToOne
    private SacemRegistration sacemRegistration;

    @ManyToMany
    @JoinTable(
            name = "ArtistFavInstruments",
            joinColumns = @JoinColumn(name = "artist_id"),
            inverseJoinColumns = @JoinColumn(name = "instrument_id"))
    List<Instrument> playableInstruments = new ArrayList<>();

    @ManyToOne()
    Instrument favoriteInstrument;

    public Artist() {
    }

    public Artist(String bandName, int size, String country) {
        this.bandName = bandName;
        this.size = size;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public SacemRegistration getSacemRegistration() {
        return sacemRegistration;
    }

    public void setSacemRegistration(SacemRegistration sacemRegistration) {
        this.sacemRegistration = sacemRegistration;
    }

    public List<Instrument> getPlayableInstruments() {
        return playableInstruments;
    }

    public void setPlayableInstruments(List<Instrument> playableInstruments) {
        this.playableInstruments = playableInstruments;
    }

    public Instrument getFavoriteInstrument() {
        return favoriteInstrument;
    }

    public void setFavoriteInstrument(Instrument favoriteInstrument) {
        this.favoriteInstrument = favoriteInstrument;
    }
}
