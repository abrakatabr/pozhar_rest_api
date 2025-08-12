package ru.pozhar.pozhar_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.pozhar.pozhar_rest_api.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Transactional
    @Override
    <S extends Project> S save(S entity);

    @Transactional
    @Override
    void deleteById(Long id);
}
