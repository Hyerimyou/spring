package member.board.command;

import lombok.Data;

@Data
public class OrderItem {

	private Integer itemId;
	private Integer number;//command객체안에 파라미터값넣기
	private String remark;
}