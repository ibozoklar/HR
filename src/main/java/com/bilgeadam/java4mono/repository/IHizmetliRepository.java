package com.bilgeadam.java4mono.repository;

import com.bilgeadam.java4mono.repository.entity.Hizmetli;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHizmetliRepository extends JpaRepository<Hizmetli,Long> {

}
