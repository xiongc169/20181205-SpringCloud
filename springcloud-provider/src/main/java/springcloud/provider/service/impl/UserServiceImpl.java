package springcloud.provider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.provider.dao.UserRepository;
import springcloud.provider.model.User;
import springcloud.provider.service.IUserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        user = userRepository.saveAndFlush(user);
        return user;
    }

    public User getUser(Long Id) {
        Optional<User> user = userRepository.findById(Id);
        return user.get();
    }
}
