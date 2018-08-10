package spring.mashagbeh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.mashagbeh.model.UserSystem;

@Repository("userSystemRepository")
public interface UserSystemRepository extends JpaRepository<UserSystem , Long> {

    /** Find User By Email. */
    UserSystem findUserByEmail(String email);
}
