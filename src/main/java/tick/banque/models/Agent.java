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

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    public enum Role {
        ROLE_ADMIN, ROLE_AGENT, ROLE_CLIENT
    }


    public Agent() {
    }

    public Agent(int agentId, String passwrod, String username, Role role) {
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

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passwrod) {
        this.password = passwrod;
    }
}
