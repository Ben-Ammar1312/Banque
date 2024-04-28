package tick.banque.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tick.banque.interfaces.CompteInterface;
import tick.banque.models.Compte;

import java.util.List;

@RequestMapping("/compte")
@RestController
public class CompteController {
    @Autowired
    private CompteInterface compte;
    // Get all examples
    @GetMapping

    public List<Compte> getAllComptes() {
        return compte.findAll();
    }
}
