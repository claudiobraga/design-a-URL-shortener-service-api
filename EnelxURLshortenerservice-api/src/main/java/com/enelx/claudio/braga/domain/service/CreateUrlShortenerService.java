package com.enelx.claudio.braga.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enelx.claudio.braga.domain.exception.UrlShortenerException;
import com.enelx.claudio.braga.domain.model.Url;
import com.enelx.claudio.braga.domain.model.UrlShortener;
import com.enelx.claudio.braga.domain.repository.UrlRepository;

@Service
public class CreateUrlShortenerService {
	
	@Autowired
	private UrlRepository urlRepository;
	
	@Autowired
	private UrlShortener urlShortener;
	
	public Url createShortenerUrl(Url url) {
		
		Integer msg = urlShortener.decode(url.getOriginalUrl());
		url.setShortUrl(urlShortener.encode(msg));
		
		Url shortenerUrlExist = urlRepository.findByShortUrlLike(url.getShortUrl());
		if (shortenerUrlExist != null || url.getShortUrl().equals("")) {
			
			throw new UrlShortenerException("The Short URL for this Original URL, Exist Already!");
		}
		return urlRepository.save(url);
	}

}