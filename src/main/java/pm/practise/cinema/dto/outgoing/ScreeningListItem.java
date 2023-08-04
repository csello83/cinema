package pm.practise.cinema.dto.outgoing;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import pm.practise.cinema.domain.Screening;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ScreeningListItem {

    private String pictureUrl;
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime screeningDate;
    private Long totalSeat;
    private Long freeSeat;

    public ScreeningListItem(Screening screening) {
        this.pictureUrl = screening.getPictureUrl();
        this.title = screening.getTitle();
        this.screeningDate = screening.getScreeningDate();
        this.totalSeat = screening.getTotalSeat();
        this.freeSeat = this.totalSeat - 0; //TODO !!!!!!!!!!!!!!!!!!!!
    }
}
