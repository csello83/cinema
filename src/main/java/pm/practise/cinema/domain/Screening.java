package pm.practise.cinema.domain;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pm.practise.cinema.dto.incoming.ScreeningCommand;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@Entity
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title; //- Movie title (String, mandatory)
    @Column(nullable = false)
    private LocalDateTime screeningDate; //  - Screening date/time (LocalDateTime, mandatory)
    @Column(nullable = false)
    private Long totalSeat; //  - Total seats (Integer, mandatory)
    @Column
    private String pictureUrl; //  - Picture URL (String, optional)

    public Screening(ScreeningCommand command) {

        this.title = command.getTitle();
        this.screeningDate = command.getScreeningDate();
        this.totalSeat = command.getTotalSeat();
        this.pictureUrl = command.getPictureUrl();
    }
}
