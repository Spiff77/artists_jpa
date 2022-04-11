package monprojet.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private InstrumentType instrumentType;

    @ManyToMany(mappedBy = "playableInstruments")
    private List<Artist> players = new ArrayList<>();

    @OneToMany(mappedBy = "favoriteInstrument")
    private List<Artist> playerFavInstrument = new ArrayList<>();

    public Instrument(int id, InstrumentType instrumentType) {
        this.id = id;
        this.instrumentType = instrumentType;
    }

    public Instrument() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public List<Artist> getPlayers() {
        return players;
    }

    public void setPlayers(List<Artist> players) {
        this.players = players;
    }

    public List<Artist> getPlayerFavInstrument() {
        return playerFavInstrument;
    }

    public void setPlayerFavInstrument(List<Artist> playerFavInstrument) {
        this.playerFavInstrument = playerFavInstrument;
    }
}
