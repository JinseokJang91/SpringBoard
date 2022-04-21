package com.js.board.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Board {

	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String userName;
	private String boardDate;
	private int readCount;
	
}