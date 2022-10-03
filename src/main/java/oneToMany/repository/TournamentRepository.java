package oneToMany.repository;

import oneToMany.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament,Integer> {
}
