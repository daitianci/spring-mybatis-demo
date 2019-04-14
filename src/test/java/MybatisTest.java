import com.honor.mybatis.entity.User;
import com.honor.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 戴天赐 on 2019/4/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MybatisTest {

    @Resource
    UserMapper userMapper;

    @Test
    public void testMybatis(){
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user.getNickname());
        }
    }
}
