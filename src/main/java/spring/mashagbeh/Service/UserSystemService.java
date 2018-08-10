package spring.mashagbeh.Service;

import spring.mashagbeh.model.UserSystem;

public interface UserSystemService {

    /**
     * Find User By Email.
     *
     * @param email
     *
     * @return User System Entity
     */
    public UserSystem findUserByEmail(String email);

    /**
     * Save New User.
     *
     * @param user
     */
    public void saveUser(UserSystem user);
}
