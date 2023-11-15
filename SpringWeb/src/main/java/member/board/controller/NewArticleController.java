package member.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import member.board.command.NewArticleCommand;
import member.board.service.ArticleService;

@Controller//controller 어노테이션이라 NewArticleController클래스는 빈으로만들어짐
@RequestMapping("/article/newArticle")
public class NewArticleController {

	@Autowired//빈 만들어질때 의존하는애들 주입시켜줌
	private ArticleService articleService;//newArticlecontroller에 articleservice주입시킴

	// @RequestMapping 메서드의 리턴 타입이 String => return값을 viewname으로 사용
	// @RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public String form() {//get방식으로 매핑이들어오면 이거실행
		return "article/newArticleForm";//문자열이니까 viewname
	}

	@PostMapping//post방식으로 들어오면 이거실행
	public String submit(@ModelAttribute("command") NewArticleCommand command) {
		//디스페처서블릿이 NewArticleCommand 객체를생성하고 매개변수에 주소값을 전달
		//@*mapping이 요청파라미터(form데이터) 즉 parentid title content 값을 변수명에 맞게 저장시킴(setter)
		articleService.writeArticle(command);
		return "article/newArticleSubmit"; //viewname문자열리턴
		//("command") NewArticleCommand 객체생성(model)
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

}