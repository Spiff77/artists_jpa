package monprojet.model.testlombok;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class  Car extends Vehicule{

    @NonNull
    private Owner owner;

    public Car(@NonNull String model, @NonNull String color, @NonNull Owner owner) {
        super(model, color);
        this.owner = owner;
    }
}
