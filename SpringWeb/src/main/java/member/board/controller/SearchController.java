package member.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
   
@Controller
public class SearchController {//welcome file인 index.html실행

	@RequestMapping("/search/internal")//요렇게 요청이들어오면 밑에실행
	public ModelAndView searchInternal(//model+view의 정보가 담겨져있음(ModelAndView)
		String query,@RequestParam("p") int pageNumber) {//p가 반드시있어야함
		System.out.println("query=" + query + ",pageNumber=" + pageNumber);//받아온 query와 p값을 출력
		return new ModelAndView("search/internal");
		//ModelAndView("viewname", "Model", "View)
		//viewname application.properties가서 suffix prefix붙여줘서 경로설정
	}

	@RequestMapping("/search/external")
	public ModelAndView searchExternal(
			String query,@RequestParam(value = "p", defaultValue = "1") int pageNumber) {
		System.out.println("query=" + query + ",pageNumber=" + pageNumber);
		return new ModelAndView("search/external");
	}
}