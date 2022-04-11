package monprojet.model;

import jakarta.persistence.*;

@Entity
public class SacemRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;

    @OneToOne(mappedBy = "sacemRegistration")
    private Artist artist;

    public SacemRegistration() {
    }

    public SacemRegistration(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SacemRegistration{");
        sb.append("id=").append(id);
        sb.append(", code='").append(code).append('\'');
        sb.append(", artist=").append(artist.getId());
        sb.append('}');
        return sb.toString();
    }
}
