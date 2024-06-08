package ilja.spring.runnerz.run;

import ilja.spring.runnerz.run.entity.Run;
import ilja.spring.runnerz.run.enumeration.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RunRepository extends JpaRepository<Run, Integer>{
    List<Run> findByLocation(Location location);
}
