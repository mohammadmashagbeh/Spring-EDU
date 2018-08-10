package spring.mashagbeh.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="USER_SYSTEM")
public class UserSystem {

    /**
     * Constants
     */

    public enum Status{

        ACTIVE(new Integer(1)),
        NOT_ACTIVE(new Integer(1));

        private Integer status;

        public Integer getStatus() {

            return this.status;

        }

        Status(Integer status) {

            this.status = status;

        }
    }

    /**
     * Instance Variables
     */

    /** ID */
    @Id
    @GeneratedValue(generator="seqGen")
    @SequenceGenerator(name="seqGen",sequenceName="USR_SEQ", allocationSize=1)
    private Long id;

    /** Status. */
    private Integer status;

    /** Email */
    private String email;

    /** Name */
    private String name;

    /** Last Name */
    @Column(name = "last_name")
    private String lastName;

    /** Password */
    private String password;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( name = "user_role",
                joinColumns = @JoinColumn(name = "usr_id" , referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "rol_id" , referencedColumnName = "id")
              )
    private Set<SystemRole> roles;

    /**
     * Setter
     */
    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter
     */

    public Long getId() {
        return id;
    }

    public Integer getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public Set<SystemRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<SystemRole> roles) {
        this.roles = roles;
    }
}
