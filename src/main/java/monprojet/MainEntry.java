package monprojet;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import monprojet.model.Artist;
import monprojet.model.Instrument;
import monprojet.model.InstrumentType;
import monprojet.model.SacemRegistration;


public class MainEntry {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("company");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Artist a = new Artist("MotorHead", 4, "USA");
        SacemRegistration sr = new SacemRegistration("MTRUSA234T549");
        Instrument i = new Instrument("Guitar", InstrumentType.String);
        Instrument j = new Instrument("Drum", InstrumentType.Percussion);
        Instrument k = new Instrument("Flute", InstrumentType.WoodWind);


        a.setFavoriteInstrument(i);
        a.addJouableInstrument(i);
        a.addJouableInstrument(j);
        a.addJouableInstrument(k);


        sr.setArtist(a);
        a.setSacemRegistration(sr);

        em.persist(a);
        em.persist(i);
        em.persist(j);
        em.persist(k);
        em.persist(sr);
        em.getTransaction().commit();

        emf.close();
        em.close();
    }

}
