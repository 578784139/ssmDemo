package Tbuser;

import cn.bdqn.tangcco.dao.TbuserMapper;
import cn.bdqn.tangcco.entity.Tbuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by HP on 2017/6/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TbuserTest {
    @Inject
    private TbuserMapper tbuserMapper;

    public void testLogin(){
        Tbuser tbuser=new Tbuser();
        tbuser.setUsername("admin");
        tbuser.setPassword("1234");
        System.out.println(tbuserMapper.login(tbuser));
    }
}
