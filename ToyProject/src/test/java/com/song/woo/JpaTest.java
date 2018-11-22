//package com.song.woo;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.song.woo.board.model.Comment;
//import com.song.woo.member.repository.MemberRepository;
//
//
//@RunWith(SpringRunner.class) // Junit 테스트 선언
//@DataJpaTest // DataJpaTest 선언
//public class JpaTest {
//	/* 
//    	Repository == Dao
//    	본인이 테스트하려는 Dao를 선언하고 기능을 테스트 하면 된다.
//    	아래는 여기 프로젝트에서 사용한 코드의 일부이다.
//	 */
//	
//	@Autowired
//	private MemberRepository memberRepository;
//
//	@Autowired
//	private MemberRepository commentRepository;
//	
//	@Autowired
//	private MemberRepository boardRepository;
//	
//	//Post클래스
//	@Entity
//	public class Post{
//		@OneToMany(mappedBy="post", cascade = CascadeType.ALL)
//		private List<Comment> comments;
//	}
//	//comment클래스
//	@Entity
//	public class comment{
//		
//		@ManyToOne(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
//		@JoinColumn(foreignKey = @ForeignKey(name = "fk_comment_post"))
//		private Post post;
//	}
//}
//
