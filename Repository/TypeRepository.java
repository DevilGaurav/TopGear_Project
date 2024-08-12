package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer> {
}
