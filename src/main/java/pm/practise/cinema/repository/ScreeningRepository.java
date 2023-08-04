package pm.practise.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pm.practise.cinema.domain.Screening;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {
}
