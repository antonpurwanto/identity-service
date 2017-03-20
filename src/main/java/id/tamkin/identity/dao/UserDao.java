package id.tamkin.identity.dao;

import id.tamkin.identity.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<User, String>{
    public User findByUsername(String username);
    public User findByEmail(String email);
}
