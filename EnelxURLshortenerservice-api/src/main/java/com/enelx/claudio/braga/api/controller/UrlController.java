package com.enelx.claudio.braga.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.enelx.claudio.braga.domain.model.Url;
import com.enelx.claudio.braga.domain.repository.UrlRepository;
import com.enelx.claudio.braga.domain.service.CreateUrlShortenerService;

@RestController
@RequestMapping("/urls")
public class UrlController {
	
	@Autowired
	private UrlRepository urlRepository;
	
	@Autowired
	private CreateUrlShortenerService urlShortenerService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Url createUrlShortener(@Valid @RequestBody Url url) {
		return urlShortenerService.createShortenerUrl(url);
	}
	
	@GetMapping("/shortenerUrl")
	public String getshortenerUrl(@RequestParam String shortUrl) {
		Url url = urlRepository.findByShortUrl(shortUrl);
		String resp = url.getOriginalUrl();
		return resp;
	}
}
