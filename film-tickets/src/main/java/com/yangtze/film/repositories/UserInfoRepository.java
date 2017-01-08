package com.yangtze.film.repositories;

import org.springframework.data.repository.CrudRepository;

import com.yangtze.film.entities.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, String> {

}
