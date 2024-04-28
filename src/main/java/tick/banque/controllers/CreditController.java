package tick.banque.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tick.banque.interfaces.CreditInterface;
import tick.banque.models.Credit;

import java.util.List;

@RequestMapping("/credit")
@RestController
public class CreditController {
    @Autowired
    private CreditInterface credit;
    // Get all examples
    @GetMapping

    public List<Credit> getAllCredits() {
        return credit.findAll();
    }
}
