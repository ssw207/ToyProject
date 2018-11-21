package com.song.woo.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.song.woo.board.model.Comment;
import com.song.woo.member.model.Memeber;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	
}
