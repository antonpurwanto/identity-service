package id.tamkin.identity.dao;

import id.tamkin.identity.entity.Group;
import id.tamkin.identity.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTests {

    @Autowired private UserDao userDao;

    @Test
    public void testFindUser(){
        assertNull(userDao.findByUsername("test"));
        assertNull(userDao.findByEmail("none@example.com"));

        User u = userDao.findByUsername("user001");
        validateUser(u);

        User ux = userDao.findByEmail("u001@example.com");
        validateUser(ux);
    }

    private void validateUser(User u) {
        assertNotNull(u);
        assertEquals("User 001", u.getFullname());
    }
}
