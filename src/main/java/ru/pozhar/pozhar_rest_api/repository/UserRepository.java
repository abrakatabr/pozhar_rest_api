package ru.pozhar.pozhar_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.pozhar.pozhar_rest_api.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Transactional
    @Override
    <S extends User> S save(S entity);

    @Transactional
    @Override
    void deleteById(Long id);

    @Transactional
    User updateUserById(Long id);


}
