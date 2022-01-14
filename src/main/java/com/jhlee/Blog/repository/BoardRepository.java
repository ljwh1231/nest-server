package com.jhlee.Blog.repository;

import com.jhlee.Blog.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    public Page<Board> findAllByOrderByRegiDateDesc(Pageable pageable);
    public Page<Board> findAllByOrderByHitsDesc(Pageable pageable);
    public Page<Board> findAllByCategoryOrderByRegiDateDesc(Pageable pageable);
    public Page<Board> findAllByTitleContainingOrderByRegiDateDesc(String title, Pageable pageable);
}
