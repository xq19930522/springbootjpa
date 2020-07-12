package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuqing
 * 2020年7月12日10:40:43
 * @Controller + @ResponseBody = @RestController
 *
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private LimitConfig limitConfig;

	@PostMapping("/say")
	public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
	//	return "说明：" + limitConfig.getDescription();
	return "id:" + myId;
	}

    @GetMapping("/index")
	public  Object index(){
		Map<String,Object> map=new HashMap<>();
		map.put("msg","部署成功");
		return  map;
	}

    @GetMapping("/getsay")
	public  String say(){
		return "说明：" + limitConfig.getDescription();
	}

}
