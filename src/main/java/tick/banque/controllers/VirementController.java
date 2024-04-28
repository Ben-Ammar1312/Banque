package tick.banque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tick.banque.interfaces.VirementInterface;
import tick.banque.models.Virement;

import java.util.List;

@RequestMapping("/virement")
@RestController
public class VirementController {
    @Autowired
    private VirementInterface virement;
    // Get all examples
    @GetMapping

    public List<Virement> getAllVirements() {
        return virement.findAll();
    }
}
