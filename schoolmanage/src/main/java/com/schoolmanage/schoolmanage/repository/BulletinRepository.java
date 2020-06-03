package com.schoolmanage.schoolmanage.repository;

import com.schoolmanage.schoolmanage.entity.Bulletin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BulletinRepository extends JpaRepository<Bulletin,String> {
}
