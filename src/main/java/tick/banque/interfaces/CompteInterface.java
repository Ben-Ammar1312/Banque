package tick.banque.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import tick.banque.models.Compte;

public interface CompteInterface extends JpaRepository<Compte,Integer> {
}
