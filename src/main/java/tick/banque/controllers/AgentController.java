package tick.banque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tick.banque.interfaces.AgentInterface;

@RequestMapping("/agent")
@Controller
public class AgentController {
    @Autowired
    private AgentInterface agentInterface;

    @GetMapping
    public String agentDashboard(Model model) {
        return "compte";  // This seems to be the main agent page
    }

    @GetMapping("/depot-retrait")
    public String depotRetrait(Model model) {
        // Add model attributes if needed
        return "depot-retrait";  // Make sure this view exists
    }

    @GetMapping("/virement")
    public String virement(Model model) {
        // Add model attributes if needed
        return "virement";  // Make sure this view exists
    }

    @GetMapping("/creerCompte")
    public String creerCompte(Model model) {
        // Add model attributes if needed
        return "creerCompte";  // Make sure this view exists
    }

    @GetMapping("/supprimer")
    public String supprimerCompte(Model model) {
        // Add model attributes if needed
        return "supprimer";  // Make sure this view exists
    }
}
