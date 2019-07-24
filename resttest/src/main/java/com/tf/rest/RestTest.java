package com.tf.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @author 828
 * RestTemplate主要有6个方法
 * HTTP method	RestTemplate methods 
 * DELETE		delete
 * GET			getForObject,getForEntiry
 * HEAD			headForHeaders
 * OPTIONS		optionsForAllow
 * PUT			put
 * any 			exchange,execute
 * 
 * delete() 在特定的URL上对资源执行HTTP Delete操作
 * exchange() 在URL上执行特定的Http方法，返回包含对象的resposneEntiry,这个对象是从响应体中映射得到。
 * execute() 在URL上执行特定的HTTP方法，返回一个从响应体映射得到的对象
 * getForEntiry() 发送一个HTTP GET请求，返回的ResponseEntity包含了响应体所映射成的对象
 * getForObject() 发送一个HTTP GET请求，返回的请求体将映射为一个对象
 * postForEntiry() POST 数据到一个URL，返回包含一个对象的ResponseEntity，这个对象是从响应体中映射得到的
 * postForObject() POST 数据到一个URL，返回根据响应体匹配形成的对象
 * headForHeaders() 发送HTTP HEAD请求，返回包含特定资源URL的HTTP头
 * optionsForAllow() 发送HTTP OPTIONS请求，返回对特定URL的Allow头信息
 * postForLocation() POST 数据到一个URL，返回新创建资源的URL
 * put() 资源到特定的URL
 */
@RestController
public class RestTest {
	@Autowired
	private RestTemplate restTemplate;//这样就可以直接调用api使用了或者直接new对象也一样
	private static final String URL = "http://localhost:8090/demoboot";
	private static final String method = "test";
	@RequestMapping("/rest/test")
	public String test() {
		String str = restTemplate.getForObject(URL+"/"+method, String.class);
		System.out.println(str);
		return str;
	}
	
	@RequestMapping("/test")
	public String ss() {
		return "resttest:"+URL;
	}
	
	
	
	
	
	
	
	
	
	
}
