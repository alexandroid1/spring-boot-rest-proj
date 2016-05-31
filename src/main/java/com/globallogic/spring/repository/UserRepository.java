package com.globallogic.spring.repository;

import com.globallogic.spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ALEX on 31.05.2016.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
