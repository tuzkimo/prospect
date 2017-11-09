package me.prospect.data.mapper;

import me.prospect.data.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
  @Autowired
  private UserMapper mapper;

  @Test
  public void testQueryAll() throws Exception {
    List<User> users = mapper.getAll();
    Assert.assertNotNull(users);
    Assert.assertEquals(4, users.size());
    for (User user : users) {
      System.out.println(user);
    }
  }

  @Test
  public void testQueryOne() throws Exception {
    User user = mapper.getOne("D6066C51-2127-43A7-9C9D-2350C62AB51F");
    Assert.assertNotNull(user);
    System.out.println(user);
  }

  @Test
  public void testAdd() throws Exception {
    User user = new User("anthony", "anthony005");
    Assert.assertTrue(mapper.add(user) > 0);
  }
}
