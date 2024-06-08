package ilja.spring.runnerz.run;


import com.fasterxml.jackson.databind.ObjectMapper;
import ilja.spring.runnerz.run.dto.RunDTO;
import ilja.spring.runnerz.run.entity.Run;
import ilja.spring.runnerz.run.enumeration.Location;
import ilja.spring.runnerz.run.response.RunResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RunService {
    private final RunRepository runRepository;
    private final ObjectMapper objectMapper;

    List<Run> findAll(){
        return this.runRepository.findAll();
    }

    RunResponse create(RunDTO request) {
        Run run = objectMapper.convertValue(request, Run.class);
        runRepository.save(run);

        return objectMapper.convertValue(run, RunResponse.class);
    }


    Run findById(Integer id) {
        Optional<Run> run = runRepository.findById(id);
        if (run.isEmpty()){
            throw new RunNotFoundException();
        }
        return run.get();
    }

    Run update(RunDTO request, Integer id) {
        Optional<Run> run = runRepository.findById(id);

        if (run.isEmpty()){
            throw new RunNotFoundException();
        }

        Run unwrappedRun = run.get();

        unwrappedRun.setTitle(request.getTitle());
        unwrappedRun.setStartedOn(request.getStartedOn());
        unwrappedRun.setCompletedOn(request.getCompletedOn());
        unwrappedRun.setMiles(request.getMiles());
        unwrappedRun.setLocation(request.getLocation());

        runRepository.save(unwrappedRun);

        return unwrappedRun;
    }

    void delete(Integer id) {
        runRepository.deleteById(id);
    }

    List<Run> findByLocation(Location location) {
        return runRepository.findByLocation(location);
    }






}
