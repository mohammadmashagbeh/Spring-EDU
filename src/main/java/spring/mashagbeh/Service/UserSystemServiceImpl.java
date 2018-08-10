package spring.mashagbeh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import spring.mashagbeh.dao.SystemRoleRepository;
import spring.mashagbeh.dao.UserSystemRepository;
import spring.mashagbeh.model.SystemRole;
import spring.mashagbeh.model.UserSystem;

import java.util.Arrays;
import java.util.HashSet;

@Service("userSystemService")
public class UserSystemServiceImpl implements UserSystemService {

    @Autowired
    private UserSystemRepository userSystemRepository;

    @Autowired
    private SystemRoleRepository systemRoleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     * Find User By Email.
     *
     * @param email
     *
     * @return User System
     */
    @Override
    public UserSystem findUserByEmail(String email) {
        return userSystemRepository.findUserByEmail(email);
    }

    /**
     * Save New User.
     *
     * @param user
     */
    @Override
    public void saveUser(UserSystem user) {

        // Encrypt User Password and Set it.
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        // Set User System Active.
        user.setStatus(UserSystem.Status.ACTIVE.getStatus());

        // Get All Role.
        SystemRole systemRole = systemRoleRepository.findByRole("ADMIN");

        user.setRoles(new HashSet<SystemRole>(Arrays.asList(systemRole)));

        userSystemRepository.save(user);
    }
}
