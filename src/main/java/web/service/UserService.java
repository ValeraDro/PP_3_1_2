package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserDao userdao;

    public UserService(UserDao userdao) {
        this.userdao = userdao;
    }


    public List<User> index() {
        return (List<User>) userdao.findAll();
    }

    public User show(int id) {
        return userdao.findById(id).orElse(null);
    }

    public void save(User user) {
        userdao.save(user);
    }

    public void update(int id, User user) {
        user.setId(id);
        userdao.save(user);
    }

    public void delete(int id) {
        userdao.deleteById(id);
    }
}
