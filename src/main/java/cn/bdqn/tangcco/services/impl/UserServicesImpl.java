package cn.bdqn.tangcco.services.impl;

import cn.bdqn.tangcco.dao.TbuserMapper;
import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.services.UserServices;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by HP on 2017/6/13.
 */
@Service
public class UserServicesImpl implements UserServices {
    @Inject
    private TbuserMapper tbuserMapper;


    public Tbuser login(Tbuser tbuser) {
        System.out.println(tbuserMapper);
        return tbuserMapper.login(tbuser);
    }
}
