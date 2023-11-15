package member.board.command;

import lombok.Data;

@Data
public class InfoCommand {//입력받을변수들 a.jsp의 변수와 똑같이 작성
	private String name;
	private String[] lang;//여러개라서 배열로 가져옴
//	private List<String> lang; 해도가져올수있음 리스트로 가져오기

}


//command에 변수들을 선언해주고