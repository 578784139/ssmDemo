package cn.bdqn.tangcco.controller;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.services.UserServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

/**
 * Created by HP on 2017/6/13.
 */
@Controller
public class DoLoginController {
    @Inject
    private UserServices userServices;
    @RequestMapping(value = "/doLogin.controller",method = RequestMethod.POST)
    public String Login(Tbuser tbuser, HttpSession httpSession, Model model){
        System.out.println(tbuser.getUsername());
        tbuser=userServices.login(tbuser);
        System.out.println("1");

        String forward = "";
        if (tbuser!=null) {
            httpSession.setAttribute("tcmp054",tbuser);
            forward = "main/main";
        }else{

            String msg = "对不起，用户名或者密码错误!";
            model.addAttribute("msg", msg);

            forward = "forward:/index.jsp";
        }

        return forward;

    }
}
