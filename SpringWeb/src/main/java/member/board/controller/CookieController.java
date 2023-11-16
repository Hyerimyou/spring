package member.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

	@RequestMapping("/cookie/make")
	public String make(HttpServletResponse response){
		response.addCookie(new Cookie("auth", "abc"));
		return "redirect:/cookie/view";//리다이렉트뷰 쿠키만들기가 아니라 쿠키확인으로 바로감
	}

	@RequestMapping("/cookie/view")//요청uri랑 
	public void view(
		@CookieValue(value = "auth", defaultValue = "0") String auth) {
		System.out.println("auth 쿠키: " + auth);
		//viewname이랑 같으면 리턴타입 void 로 바꾸고 제거가능
	}
}