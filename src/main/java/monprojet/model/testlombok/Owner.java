package monprojet.model.testlombok;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Owner {

    @NonNull
    private String name;

    @ToString.Exclude
    private List<Car> cars = new ArrayList<>();

}
