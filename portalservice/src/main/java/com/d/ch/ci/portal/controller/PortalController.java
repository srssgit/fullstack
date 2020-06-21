package com.d.ch.ci.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d.ch.ci.portal.entity.Portal;
import com.d.ch.ci.portal.service.PortalService;

@CrossOrigin
@RestController
@RequestMapping("/api/portal/portalservice")
public class PortalController {
	
	@Autowired
	private PortalService portalService;
	
	
	@GetMapping
	public List<Portal> getAllPortalMessages(){
		return portalService.findAll();
	}
	
	@PostMapping
	public Portal createPortalMessage(@RequestBody Portal portal) {
		return portalService.create(portal);
	}
	
	@PutMapping
	public Portal updatePortalMessage(@RequestBody Portal portal) {
		return portalService.create(portal);
	}

}
