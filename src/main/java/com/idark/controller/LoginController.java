package com.idark.controller;

import com.idark.domain.user.User;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author guoyakui
 * @date created in 14:16 2018/2/26
 */
@RestController
@RequestMapping("/")
public class LoginController {

    @RequestMapping("login")
    public JSONObject login(@RequestBody User user, HttpServletRequest request){

        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        return JSONObject.fromObject(user);
    }

    @RequestMapping("logout")
    public JSONObject logout(HttpServletRequest request){

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        return JSONObject.fromObject(user);
    }
}
