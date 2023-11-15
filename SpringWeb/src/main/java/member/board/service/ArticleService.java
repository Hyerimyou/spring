package member.board.service;

import org.springframework.stereotype.Service;

import member.board.command.NewArticleCommand;

@Service
public class ArticleService {
	public void writeArticle(NewArticleCommand command) {
		System.out.println("신규 게시글 등록: " + command);
	}    
}