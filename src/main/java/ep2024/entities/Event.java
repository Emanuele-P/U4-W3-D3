package ep2024.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private LocalDate date;
    private String description;
    @Column(name = "event_type")
    @Enumerated(EnumType.STRING)
    private EventType type;
    @Column(name = "max_number_of_participants")
    private int numOfParticipants;

    public Event() {
    }

    public Event(String title, LocalDate date, String description, EventType type, int numOfParticipants) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.type = type;
        this.numOfParticipants = numOfParticipants;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int getNumOfParticipants() {
        return numOfParticipants;
    }

    public void setNumOfParticipants(int numOfParticipants) {
        this.numOfParticipants = numOfParticipants;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", numOfParticipants=" + numOfParticipants +
                '}' + System.lineSeparator();
    }
}
