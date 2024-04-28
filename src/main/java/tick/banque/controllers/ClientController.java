package tick.banque.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tick.banque.models.Client;
import tick.banque.interfaces.ClientInterface;
import java.util.List;




@RequestMapping("/client")
@RestController
public class ClientController {
    @Autowired
    private ClientInterface client;
    // Get all examples
    @GetMapping

    public List<Client> getAllClients() {
        return client.findAll();
    }

}
