package pm.practise.cinema.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pm.practise.cinema.domain.Screening;
import pm.practise.cinema.dto.incoming.ScreeningCommand;
import pm.practise.cinema.dto.outgoing.ScreeningListItem;
import pm.practise.cinema.repository.ScreeningRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ScreeningService {

    private ScreeningRepository screeningRepository;

    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    public void addScreening(ScreeningCommand command) {
        screeningRepository.save(new Screening(command));
    }

    public List<ScreeningListItem> getAllScreenings() {
        return screeningRepository.findAll().stream().map(ScreeningListItem::new)
                .collect(Collectors.toList());
    }
}
