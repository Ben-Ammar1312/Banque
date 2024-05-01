package tick.banque.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tick.banque.interfaces.PaiementCreditInterface;
import tick.banque.models.PaiementCredit;
import java.util.List;

@RequestMapping("/paiement")
@RestController
public class PaiementCreditController {
    @Autowired
    private PaiementCreditInterface paiement;
    // Get all examples
    @GetMapping

    public List<PaiementCredit> getAllPaiments() {
        return paiement.findAll();
    }
}
