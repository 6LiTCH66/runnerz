package ilja.spring.runnerz.run;


import ilja.spring.runnerz.run.dto.RunDTO;
import ilja.spring.runnerz.run.entity.Run;
import ilja.spring.runnerz.run.enumeration.Location;
import ilja.spring.runnerz.run.response.RunResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/runs")
public class RunController {

    private final RunService runService;

    @GetMapping("")
    List<Run> findAll(){
        return runService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    RunResponse create(@Valid @RequestBody RunDTO request) {
        return runService.create(request);
    }

    @GetMapping("/{id}")
    Run findById(@PathVariable Integer id) {
        return runService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    Run update(@Valid @RequestBody RunDTO request, @PathVariable Integer id) {
       return runService.update(request, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
        runService.delete(id);
    }

    @GetMapping("/location")
    List<Run> findByLocation(@RequestParam(name = "location") Location location) {
        return runService.findByLocation(location);
    }


}
