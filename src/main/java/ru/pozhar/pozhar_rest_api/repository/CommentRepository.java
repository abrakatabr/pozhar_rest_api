package ru.pozhar.pozhar_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.pozhar.pozhar_rest_api.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Transactional
    @Override
    <S extends Comment> S save(S entity);

    @Transactional
    @Override
    void deleteById(Long id);
}
