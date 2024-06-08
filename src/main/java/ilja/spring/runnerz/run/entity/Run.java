package ilja.spring.runnerz.run.entity;

import ilja.spring.runnerz.run.enumeration.Location;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.With;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Run{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;

        @Column(nullable = false)
        String title;

        @Column(nullable = false)
        LocalDateTime startedOn;

        @Column(nullable = false)
        LocalDateTime completedOn;

        @Column(nullable = false)
        Integer miles;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        Location location;

}
