package tick.banque.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "versement")
public class Versement  extends Operation{
    public Versement() {
        super();
    }

    public Versement(int numOp, Date dateOp, int agentId, double fraisOp, double montant) {
        super(numOp, dateOp, agentId, fraisOp, montant);
    }
}
