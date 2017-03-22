package com.example.controller;

import com.example.entity.Player;
import com.example.entity.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * XmlController.
 *
 * @author DC
 *
 */
@RestController
@RequestMapping("/xml/")
public class XmlController {
  /**
   * 年龄30.
   */
  private static final int AGE_30 = 30;

  /**
   * 长度5.
   */
  private static final int LENTH_5 = 5;
  /**
   * 年龄10.
   */
  private static final int AGE_10 = 10;

  /**
   * 初始化方法.
   */
  @PostConstruct
  public void init() {
    initData();
  }

  private void initData() {
    Team team1 = new Team();
    team1.setName("Jason s");
    team1.setAge(AGE_10);
    List<Player> players = new ArrayList<Player>();
    for (int j = 0; j < LENTH_5; j++) {
      Player player = new Player();
      player.setName("Jason s" + j);
      player.setAge(AGE_30 + j);
      players.add(player);
    }
    team1.setPlayers(players);
  }

  /**
   * 首页.
   *
   * @param model
   *            模型
   * @return 页面
   */
  @RequestMapping("/")
  public String index(final Map<String, Object> model) {
    init();
    return "index";
  }

  /**
   * 获取json字符串.
   *
   * @return 返回字符串列表
   */
  @RequestMapping("/ajaxJson")
  public List<String> ajaxJson() {
    List<String> jsons = new ArrayList<String>();
    jsons.add("sss");
    return jsons;
  }

  /**
   * 支持/team.xml 和/team.json请求.
   *
   * @return 返回对象列表
   */
  @RequestMapping("/team")
  public Team team() {
    Team team1 = new Team();
    team1.setName("Jason s");
    team1.setAge(AGE_10);
    List<Player> players = new ArrayList<Player>();
    for (int j = 0; j < 1; j++) {
      Player player = new Player();
      player.setName("Jason s" + j);
      player.setAge(AGE_30 + j);
      players.add(player);
    }
    team1.setPlayers(players);
    return team1;
  }
}
