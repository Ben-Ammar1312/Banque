package tick.banque.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import tick.banque.models.Agent;

public interface AgentInterface extends JpaRepository<Agent,Integer> {
}
