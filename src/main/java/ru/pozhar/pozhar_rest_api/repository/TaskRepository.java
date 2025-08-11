package ru.pozhar.pozhar_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.pozhar.pozhar_rest_api.entity.Task;
import ru.pozhar.pozhar_rest_api.entity.User;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    @Transactional
    @Override
    <S extends Task> S save(S task);

    @Transactional
    @Override
    void deleteById(Long id);

    @Transactional
    void updateStatusById(String status, Long id);

    @Transactional
    void updateAssigneeById(User assignee, Long id);

    List<Task> findByProject(Long project_id);
}
