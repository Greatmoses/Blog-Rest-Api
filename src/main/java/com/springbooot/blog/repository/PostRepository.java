package com.springbooot.blog.repository;

import com.springbooot.blog.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

//import java.awt.print.Pageable;
import org.springframework.data.domain.Pageable;


public interface PostRepository extends JpaRepository<Post, Long> {
    Page<Post> findAll(Pageable pageable);
}
