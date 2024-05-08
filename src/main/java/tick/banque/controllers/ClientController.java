package tick.banque.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tick.banque.models.Agent;
import tick.banque.models.Client;
import tick.banque.interfaces.ClientInterface;
import tick.banque.models.Operation;

import java.util.List;




@RequestMapping("/client")
@Controller
public class ClientController {
    @Autowired
    private ClientInterface client;
    // Get all examples
    @GetMapping
    public String adminPage(Model model) {

     //   client.findById();
      //  model.addAttribute("agents", agents);
        return "admin";
    }

}
