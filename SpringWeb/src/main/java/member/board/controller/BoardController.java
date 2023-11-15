package member.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@GetMapping("/hello")//hello라는 요청이 get방식으로 들어왔으면 아래메서드를 실행
	public String hello(Model m) {
		m.addAttribute("hello", "hello,spring!");//속성에 값을 대입해준다
		return "hello";//viewname리턴(string값은 viewname)
	}
	
}

