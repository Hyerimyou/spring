package member.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import member.board.command.InfoCommand;

@Controller
public class AController {
	
	@GetMapping("/a")// /a라고 요청이들어왔을때 아래를실행
	public String a() {
		return "test/a";
	}
	
	@PostMapping("/a")
	public String info(InfoCommand info) {//커맨드타입의 변수를 걸어준다
		return "test/info";
	}

}

//컨트롤러에서 로직메서드를 호출받아실행