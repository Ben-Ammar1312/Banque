package tick.banque.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import tick.banque.models.Operation;

public interface OperationInterface extends JpaRepository<Operation, Integer> {
}
