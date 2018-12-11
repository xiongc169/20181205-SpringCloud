package springcloud.provider.service;

import springcloud.provider.model.User;

public interface UserService {

    User addUser(User user);

    User getUser(Long Id);
}
