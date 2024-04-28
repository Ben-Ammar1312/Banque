package tick.banque.models;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "Agent")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agentId")
    private int agentId;

    @Column(name = "username")
    private String username;

    @Column(name = "password_hash")
    private String passwrod;

    @Column(name = "isAdmin")
    private boolean isAdmin;

    public Agent() {
    }

    public Agent(int agentId, String passwrod, String username, boolean isAdmin) {
        this.agentId = agentId;
        this.passwrod = passwrod;
        this.username = username;
        this.isAdmin = isAdmin;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }
}
