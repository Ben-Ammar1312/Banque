package tick.banque.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tick.banque.interfaces.RetraitInterface;
import tick.banque.models.Retrait;


import java.util.List;

@RequestMapping("/retrait")
@RestController
public class RetraitController {
    @Autowired
    private RetraitInterface retrait;
    // Get all examples
    @GetMapping

    public List<Retrait> getAllRetraits() {
        return retrait.findAll();
    }
}

