package com.rekahdo.goodshop.user_service.controllers;

import com.rekahdo.goodshop.user_service.entities.AppUser;
import com.rekahdo.goodshop.user_service.services.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
@RequiredArgsConstructor
public class AppUserController {

	private final AppUserService service;
	
	@GetMapping("/retrieve-all-accounts")
	@ResponseStatus(HttpStatus.OK)
	public List<AppUser> getAll(){
		return service.getAll();
	}

}