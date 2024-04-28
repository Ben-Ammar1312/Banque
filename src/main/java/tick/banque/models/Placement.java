package tick.banque.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Placement")
public class Placement extends Operation{

    @Column(name = "interet")
    private double interet;

    @Column(name = "nouveauMontant")
    private double nouveauMontant;

    public Placement() {
        super();
    }

    public Placement(int numOp, Date dateOp, int agentId, double fraisOp, double montant, double interet, double nouveauMontant) {
        super(numOp, dateOp, agentId, fraisOp, montant);
        this.interet = interet;
        this.nouveauMontant = nouveauMontant;
    }

    public double getInteret() {
        return interet;
    }

    public void setInteret(double interet) {
        this.interet = interet;
    }

    public double getNouveauMontant() {
        return nouveauMontant;
    }

    public void setNouveauMontant(double nouveauMontant) {
        this.nouveauMontant = nouveauMontant;
    }
}
