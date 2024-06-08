package ilja.spring.runnerz.run.response;

import ilja.spring.runnerz.run.enumeration.Location;

import java.time.LocalDateTime;

public record RunResponse(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location

) {
}
