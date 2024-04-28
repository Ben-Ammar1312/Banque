package tick.banque.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tick.banque.interfaces.AgentInterface;
import tick.banque.models.Agent;


import java.util.List;

@RequestMapping("/agent")
@RestController
public class AgentController {
    @Autowired
    private AgentInterface agent;
    // Get all examples
    @GetMapping

    public List<Agent> getAllAgents() {
        return agent.findAll();
    }
}
