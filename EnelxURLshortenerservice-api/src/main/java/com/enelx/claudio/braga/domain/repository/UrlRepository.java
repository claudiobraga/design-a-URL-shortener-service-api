package com.enelx.claudio.braga.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enelx.claudio.braga.domain.model.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long>{
	
	Url findByShortUrl(String shortenerUrl);
	
	Url findByShortUrlLike(String shortUrl);

}