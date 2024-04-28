package tick.banque.interfaces;
import tick.banque.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientInterface extends JpaRepository<Client,Integer> {
}
