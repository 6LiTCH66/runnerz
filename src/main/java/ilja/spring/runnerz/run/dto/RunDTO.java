package ilja.spring.runnerz.run.dto;


import ilja.spring.runnerz.run.enumeration.Location;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RunDTO {
    @NotEmpty(message = "Title is required")
    String title;
    @NotNull
    LocalDateTime startedOn;
    @NotNull
    LocalDateTime completedOn;
    @Positive
    @NotNull
    Integer miles;
    @NotNull(message = "Location is required")
    Location location;
}
