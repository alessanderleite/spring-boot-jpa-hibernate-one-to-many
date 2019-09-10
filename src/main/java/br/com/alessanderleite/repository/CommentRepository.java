package br.com.alessanderleite.repository;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alessanderleite.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{
	Page<Comment> findByPostId(Long postId, Pageable pageable);
	Optional<Comment> findByIdAndPostId(Long id, Long postId);
}
