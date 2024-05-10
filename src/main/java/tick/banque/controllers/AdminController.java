package tick.banque.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
        model.addAttribute("agent", new Agent());
        return "admin";
    }
    @PostMapping("/deleteAgent/{agentId}")
    public String deleteAgent(@PathVariable("agentId") int agentId) {
        agentInterface.deleteById(agentId);
        return "redirect:/admin";
    }


    @PostMapping("/addAgent")
    public String addAgent(@ModelAttribute Agent agent) {
        agentInterface.save(agent);  // Save the new agent to the database
        return "redirect:/admin";  // Redirect back to the admin page to see the list of agents
    }

}
