package monprojet.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public @Data class SacemRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String code;

    @ToString.Exclude
    @OneToOne(mappedBy = "sacemRegistration")
    private Artist artist;

}
