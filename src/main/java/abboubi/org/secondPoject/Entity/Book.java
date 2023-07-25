package abboubi.org.secondPoject.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType. IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String title;

        @Column(nullable = false)
        private String author;

        private String description; // Nouvelle colonne

        public long getId() {
        return id;
    }
}
