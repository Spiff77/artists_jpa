package monprojet.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String name;

    @NonNull
    @Enumerated(EnumType.STRING)
    private InstrumentType instrumentType;

    @ManyToMany(mappedBy = "playableInstruments")
    private List<Artist> players = new ArrayList<>();

    @OneToMany(mappedBy = "favoriteInstrument")
    private List<Artist> playerFavInstrument = new ArrayList<>();

}
