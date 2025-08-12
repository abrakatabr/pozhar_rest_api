package ru.pozhar.pozhar_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.pozhar.pozhar_rest_api.entity.Task;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    @Transactional
    @Override
    <S extends Task> S save(S task);

    @Transactional
    @Override
    void deleteById(Long id);

    @Query(value = "SELECT * FROM tasks t WHERE t.project_id = :id", nativeQuery = true)
    List<Task> findByProjectId(@Param("id") Long project_id);
}
