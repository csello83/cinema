package pm.practise.cinema.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pm.practise.cinema.domain.Screening;
import pm.practise.cinema.dto.incoming.ScreeningCommand;
import pm.practise.cinema.dto.outgoing.ScreeningListItem;
import pm.practise.cinema.service.ScreeningService;

import java.util.List;

@RestController
@RequestMapping("/api/screenings")
public class ScreeningController {

    private ScreeningService screeningService;

    public ScreeningController(ScreeningService screeningService) {
        this.screeningService = screeningService;
    }

    @PostMapping
    public ResponseEntity addScreening(@RequestBody ScreeningCommand command){
        screeningService.addScreening(command);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/list-all")
    public ResponseEntity<List<ScreeningListItem>> getAllScreenings() {
        List<ScreeningListItem> screeningListItems = screeningService.getAllScreenings();
        return new ResponseEntity<>(screeningListItems, HttpStatus.OK);
    }

}
