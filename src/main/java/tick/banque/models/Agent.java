package tick.banque.models;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "Agent")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agent_id")
    private int agentId;

    @Column(name = "username")
    private String username;

    @Column(name = "password_hash")
    private String password;

    @Column(name = "role")
    private String role;

    public Agent() {
    }

    public Agent(int agentId, String passwrod, String username, String role) {
        this.agentId = agentId;
        this.password = passwrod;
        this.username = username;
        this.role = role;
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

    public String getRole() {
        return this.role;
    }

    public void setAdmin(String admin) {
        this.role = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passwrod) {
        this.password = passwrod;
    }
}
