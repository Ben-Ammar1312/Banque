package tick.banque.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "retrait")
public class Retrait extends Operation{
    public Retrait() {
        super();
    }

    public Retrait(int numOp, Date dateOp, int agentId, double fraisOp, double montant) {
        super(numOp, dateOp, agentId, fraisOp, montant);
    }
}
