package com.d.ch.ci.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d.ch.ci.portal.entity.Portal;

public interface PortalRepository extends JpaRepository<Portal, String> {

}
