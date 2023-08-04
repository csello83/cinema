package pm.practise.cinema.dto.incoming;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ScreeningCommand {

    private String title; //- Movie title (String, mandatory)
    private LocalDateTime screeningDate; //  - Screening date/time (LocalDateTime, mandatory)
    private Long totalSeat; //  - Total seats (Integer, mandatory)
    private String pictureUrl;
}
