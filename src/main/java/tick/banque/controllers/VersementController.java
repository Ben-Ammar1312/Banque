package tick.banque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tick.banque.interfaces.VersementInterface;
import tick.banque.models.Versement;


import java.util.List;

@RequestMapping("/versement")
@RestController
public class VersementController {
    @Autowired
    private VersementInterface versement;
    // Get all examples
    @GetMapping

    public List<Versement> getAllVersements() {
        return versement.findAll();
    }
}

