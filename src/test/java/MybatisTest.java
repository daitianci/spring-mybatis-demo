import com.honor.mybatis.entity.Order;
import com.honor.mybatis.entity.Role;
import com.honor.mybatis.entity.User;
import com.honor.mybatis.mapper.OrderMapper;
import com.honor.mybatis.mapper.RoleMapper;
import com.honor.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.util.resources.cldr.es.CalendarData_es_PY;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 戴天赐 on 2019/4/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MybatisTest {
    @Resource
    OrderMapper orderMapper;

    @Resource
    UserMapper userMapper;

    @Resource
    RoleMapper roleMapper;

    @Test
    public void testOneToOne() {
        Order order = orderMapper.selectByPrimaryKey(1);

        //此处不加在user跟student
        System.out.println(order.getOrderName());

        //延迟加载user属性
        System.out.println(order.getUser());

        //延迟加载student类
        System.out.println(order.getStudent());

        System.out.println(order);
    }

    @Test
    public void testOneToMany(){
        User user = userMapper.selectByPrimaryKey(11);

        List<Role> roles = user.getRoles();

        for (Role role : roles) {
            System.out.println(role);
        }

        Role role = roleMapper.selectByPrimaryKey(2);

        List<User> users = role.getUsers();

        for (User user1 : users) {
            System.out.println(user1);
        }
    }
}
