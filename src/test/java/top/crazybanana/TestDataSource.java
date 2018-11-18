package top.crazybanana;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zhangbo
 * Date: 2018/11/18
 * Time: 15:17
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class TestDataSource {
    @Resource
    private DataSource dataSource;

    @Test
    public void testConnection() {
        System.out.println(this.dataSource);
    }
}