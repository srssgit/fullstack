package com.d.ch.ci.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.d.ch.ci.portal.entity.Portal;
import com.d.ch.ci.portal.repository.PortalRepository;

public class PortalService {
	
	@Autowired
	private PortalRepository portalRepository;
	
	public Portal create(Portal portal) {
		return portalRepository.save(portal);
	}
	
	public Portal update(Portal portal) {
		return portalRepository.save(portal);
	}
	
	public List<Portal> findAll() {
		return portalRepository.findAll();
	}

}
