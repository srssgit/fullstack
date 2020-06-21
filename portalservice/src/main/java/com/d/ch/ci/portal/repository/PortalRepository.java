package com.d.ch.ci.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.d.ch.ci.portal.entity.Portal;

@Repository
public interface PortalRepository extends JpaRepository<Portal, String> {

}
