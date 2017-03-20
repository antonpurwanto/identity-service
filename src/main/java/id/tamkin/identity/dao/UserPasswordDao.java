package id.tamkin.identity.dao;

import id.tamkin.identity.entity.UserPassword;
import org.springframework.data.repository.CrudRepository;

public interface UserPasswordDao extends CrudRepository<UserPassword, String> {
}
