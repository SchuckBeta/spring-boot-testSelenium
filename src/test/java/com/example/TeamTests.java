package com.example;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.controller.IndexController;
import com.example.controller.TeamController;



/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeamTests {

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(
				new TeamController(),
				new IndexController()).build();
		System.out.println("***********************************************************************");
	}

	@Test
	public void testHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/iteams/hello").accept(MediaType.APPLICATION_JSON))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("hello world")));
	}

	@Test
	public void testTeamController() throws Exception {
		//测试TeamController
		RequestBuilder request = null;

		/***********************************************************************/
		// 1、get查一下user列表，应该为空
		/***********************************************************************/
		request = get("/iteams.json");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(status().isOk())
			.andExpect(content().string(equalTo("[]")));

		request = get("/iteams.xml");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(status().isOk())
			.andExpect(content().string(equalTo("<List/>")));

		
		/***********************************************************************/
		// 2、post提交一个user
		/***********************************************************************/
		request = post("/iteams.json")
				.param("id", "1")
				.param("name", "测试大师")
				.param("age", "20");
			mvc.perform(request)
				.andDo(MockMvcResultHandlers.print())
				.andExpect(content().string(equalTo("success")));

		request = post("/iteams.xml")
			.param("id", "1")
			.param("name", "测试大师")
			.param("age", "20");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(content().string(equalTo("success")));

		
		/***********************************************************************/
		// 3、get获取user列表，应该有刚才插入的数据
		/***********************************************************************/
		request = get("/iteams.json");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(status().isOk())
			.andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试大师\",\"age\":20,\"players\":null}]")));
		request = get("/iteams.xml");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(status().isOk())
			.andExpect(content().string(equalTo("<List><item><id>1</id><name>测试大师</name><age>20</age></item></List>")));

		
		/***********************************************************************/
		// 4、put修改id为1的user
		/***********************************************************************/
		request = put("/iteams/1.json")
				.param("name", "测试终极大师")
				.param("age", "30");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(content().string(equalTo("success")));
		request = put("/iteams/1.xml")
				.param("name", "测试终极大师")
				.param("age", "30");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(content().string(equalTo("success")));

		
		/***********************************************************************/
		// 5、get一个id为1的user
		/***********************************************************************/
		request = get("/iteams/1.json");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(content().string(equalTo("{\"id\":1,\"name\":\"测试终极大师\",\"age\":30,\"players\":null}")));
		request = get("/iteams/1.xml");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(content().string(equalTo("<Team><id>1</id><name>测试终极大师</name><age>30</age></Team>")));

		
		/***********************************************************************/
		// 6、del删除id为1的user
		/***********************************************************************/
		request = delete("/iteams/1.json");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(content().string(equalTo("success")));
		request = delete("/iteams/1.xml");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(content().string(equalTo("success")));

		
		/***********************************************************************/
		// 7、get查一下user列表，应该为空
		/***********************************************************************/
		request = get("/iteams.json");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(status().isOk())
			.andExpect(content().string(equalTo("[]")));
		request = get("/iteams.xml");
		mvc.perform(request)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(status().isOk())
			.andExpect(content().string(equalTo("<List/>")));
	}

	@After
	public void testEnd() {
		System.out.println("***********************************************************************");
	}
}
