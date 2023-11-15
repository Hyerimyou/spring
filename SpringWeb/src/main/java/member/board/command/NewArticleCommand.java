package member.board.command;

import lombok.Data;   

@Data
public class NewArticleCommand {
	
	private String title;//getter,setter tostring 전부 있음
	private String content;
	private int parentId;
  
}