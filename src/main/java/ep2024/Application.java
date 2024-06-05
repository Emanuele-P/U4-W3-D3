package ep2024;

import ep2024.dao.EventDAO;
import ep2024.entities.Event;
import ep2024.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4-w3-d3");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventDAO ed = new EventDAO(em);

//        Event event1 = new Event("Tech Conference", LocalDate.of(2024, 5, 1), "Event on technology", EventType.PUBLIC, 200);
//        Event event2 = new Event("Clown school presentation", LocalDate.of(2024, 6, 30), "The theatrical art of clowns", EventType.PRIVATE, 50);
//        System.out.println(event2);
//        ed.save(event1);
//        ed.save(event2);
//
        try {
            Event event1DB = ed.findById("");
            System.out.println("------------------------------" + event1DB.getDescription());
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            ed.deleteById("");
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        em.close();
        emf.close();

    }
}
