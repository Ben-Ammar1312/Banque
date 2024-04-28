package tick.banque.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "PaiementCredit")
public class PaiementCredit extends Operation {

    public PaiementCredit() {
        super();
    }

    public PaiementCredit(int numOp, Date dateOp, int agentId, double fraisOp, double montant) {
        super(numOp, dateOp, agentId, fraisOp, montant);
    }
}
