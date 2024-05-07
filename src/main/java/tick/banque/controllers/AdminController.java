package tick.banque.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tick.banque.interfaces.AgentInterface;
import tick.banque.interfaces.OperationInterface;
import tick.banque.models.Agent;
import tick.banque.models.Operation;


import java.util.List;

@RequestMapping("/admin")
@Controller
public class AdminController {
    @Autowired
    private AgentInterface agentInterface;
    @Autowired
    private OperationInterface operation;
    @GetMapping
    public String adminPage(Model model) {
        List<Operation> operations = operation.findAll();
        model.addAttribute("operations", operations);
        List<Agent> agents = agentInterface.findAll();  // Fetch all agents
        model.addAttribute("agents", agents);
        return "admin";
    }
}
