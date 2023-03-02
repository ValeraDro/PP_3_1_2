package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userdao;

    public UserServiceImpl(UserDao userdao) {
        this.userdao = userdao;
    }

    public List<User> index() {
        return userdao.index();
    }

    public User show(int id) {
        return userdao.show(id);
    }

    public void save(User user) {
        userdao.save(user);
    }

    public void update(int id, User user) {
        userdao.update(id, user);
    }

    public void delete(int id) {
        userdao.delete(id);
    }
}
