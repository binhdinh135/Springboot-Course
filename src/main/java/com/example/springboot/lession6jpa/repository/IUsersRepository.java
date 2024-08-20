package com.example.springboot.lession6jpa.repository;

import com.example.springboot.lession6jpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsersRepository extends JpaRepository<User, Long> {

    @Query("""
           select u from User u where 1=1
           and (:hp is null or u.hp = :hp)
           and (:atk is null or u.atk = :atk)
           """)
    List<User> findByHpAndAtk(Integer hp, Integer atk);

    @Query("""
           select u from User u where 1=1
           and (:hp is null or u.hp = :hp)
           and (:atk is null or u.atk = :atk)
           """)
    Page<User> findByHpAndAtkPaging(Integer hp, Integer atk, Pageable pageable);
}
