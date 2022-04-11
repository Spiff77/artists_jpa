package monprojet.model.testlombok;

import lombok.Data;

public @Data class  Car {
    private int id;
    private String model;
    private String color;
    private String ownerName;
}
