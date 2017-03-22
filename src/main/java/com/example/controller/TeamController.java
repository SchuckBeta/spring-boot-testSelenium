package com.example.controller;

import com.example.entity.Team;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/iteams")     // 通过这里配置使下面的映射都在/teams下，可去除
public class TeamController {

    static Map<Long, Team> teams = Collections.synchronizedMap(new HashMap<Long, Team>());


    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public String hello() {
        // 处理"/teams/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
//        List<Team> r = new ArrayList<Team>(teams.values());
        return "hello world";
    }

    @RequestMapping(value={"/", ""}, method=RequestMethod.GET)
    public List<Team> getTeamList() {
        // 处理"/teams/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<Team> r = new ArrayList<Team>(teams.values());
        return r;
    }

    @RequestMapping(value={"/", ""}, method=RequestMethod.POST)
    public String postTeam(@ModelAttribute Team user) {
        // 处理"/teams/"的POST请求，用来创建Team
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        teams.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Team getTeam(@PathVariable Long id) {
        // 处理"/teams/{id}"的GET请求，用来获取url中id值的Team信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return teams.get(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putTeam(@PathVariable Long id, @ModelAttribute Team user) {
        // 处理"/teams/{id}"的PUT请求，用来更新Team信息
        Team u = teams.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        teams.put(id, u);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteTeam(@PathVariable Long id) {
        // 处理"/teams/{id}"的DELETE请求，用来删除Team
        teams.remove(id);
        return "success";
    }

}