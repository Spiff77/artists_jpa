package monprojet.model.testlombok;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
public @Data class Vehicule {

    private int id;

    @NonNull
    private String model;

    @NonNull
    private String color;
}
