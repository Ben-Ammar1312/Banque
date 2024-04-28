package tick.banque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tick.banque.interfaces.PlacementInterface;
import tick.banque.models.Placement;

import java.util.List;

@RequestMapping("/placement")
@RestController
public class PlacementController {
    @Autowired
    private PlacementInterface placement;
    // Get all examples
    @GetMapping

    public List<Placement> getAllPlacements() {
        return placement.findAll();
    }
}
