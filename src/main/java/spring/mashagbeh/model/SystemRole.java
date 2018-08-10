package spring.mashagbeh.model;

import javax.persistence.*;

@Entity
@Table(name="SYSTEM_ROLE")
public class SystemRole {

    /**
     * Instance Variables
     */

    @Id
    @GeneratedValue(generator="seqGen")
    @SequenceGenerator(name="seqGen",sequenceName="ROL_SEQ", allocationSize=1)
    private Long Id;

    private Integer status;

    private String role;

    /**
     * Setter & Getter
     */

    public void setId(Long id) {
        Id = id;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getId() {
        return Id;
    }

    public Integer getStatus() {
        return status;
    }

    public String getRole() {
        return role;
    }
}
