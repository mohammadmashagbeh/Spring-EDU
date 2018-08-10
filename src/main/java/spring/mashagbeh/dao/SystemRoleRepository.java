package spring.mashagbeh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.mashagbeh.model.SystemRole;

@Repository("systemRoleRepository")
public interface SystemRoleRepository extends JpaRepository<SystemRole , Long> {

    /**
     * Find Syatem Role By Role Name.
     *
     * @Param Role
     *
     * @Retur System Role
     **/
    SystemRole findByRole(String role);
}
