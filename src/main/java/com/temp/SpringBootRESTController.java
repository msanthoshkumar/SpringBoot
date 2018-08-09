package com.temp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * Outside Package Resolving White Label Error from embedded tomcat
 *
 */
@RestController
public class SpringBootRESTController {

	@RequestMapping(value="/")
	public String method1() {
		return "Method1 Invoked";
	}
	
	@RequestMapping(value="/method2")
	public String method2() {
		return "Method2 Invoked";
	}
}
