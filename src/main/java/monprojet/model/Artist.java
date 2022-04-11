package monprojet.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public @Data class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String bandName;
    @NonNull
    private int size;
    @NonNull
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


    public void addJouableInstrument(Instrument i){
        this.playableInstruments.add(i);
    }

}
