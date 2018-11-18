package top.crazybanana.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.crazybanana.App;
import top.crazybanana.model.entity.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zhangbo
 * Date: 2018/11/18
 * Time: 16:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindByEmail() {
        String email = "scott@qq.com";
        User user = userMapper.findByEmail(email);
        System.out.println(user.toString());
    }
}