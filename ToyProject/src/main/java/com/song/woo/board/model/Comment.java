package com.song.woo.board.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Comment {
	@Data
	@Entity
	@NoArgsConstructor
	@AllArgsConstructor
	public class BoardModel {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO) 
		private long commentSeq;
		
		@Column
		private String fk_comment_post;
		
		@Column
		private String content;
		
		@Column
		private String writer;
	}
}
