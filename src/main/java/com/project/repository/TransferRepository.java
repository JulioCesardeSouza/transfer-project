package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Transfer;
@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> { 

}
