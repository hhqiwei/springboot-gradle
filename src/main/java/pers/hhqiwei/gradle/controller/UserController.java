package pers.hhqiwei.gradle.controller;

import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pers.hhqiwei.gradle.entity.User;
import pers.hhqiwei.gradle.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller("userController")
@RequestMapping("/user")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/getAllUser", method = RequestMethod.POST)
    public void findAllCourse(HttpServletRequest request, HttpServletResponse response){

        //统一设置返回数据格式
        response.setContentType("application/json");
        response.setHeader("Pragma", "no-cache");
        response.setCharacterEncoding("UTF-8");

        List<User> list = userService.getUserList();
        JSONArray jsonArray = JSONArray.fromObject(list);

        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }

        out.print(jsonArray);
        out.flush();
        out.close();
    }
}