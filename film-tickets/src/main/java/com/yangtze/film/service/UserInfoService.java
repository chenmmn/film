package com.yangtze.film.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangtze.film.repositories.UserInfoRepository;

@Service
public class UserInfoService {

	@Resource
	private UserInfoRepository userInfoRepository;
	
}
