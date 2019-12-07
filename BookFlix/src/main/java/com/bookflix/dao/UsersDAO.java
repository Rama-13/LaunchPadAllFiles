package com.bookflix.dao;

import org.springframework.data.repository.CrudRepository;

/*
 * author: anweshpatel
 * created: 07/08/2019
 * project: BookFlix
 */

import com.bookflix.models.Users;

public interface UsersDAO extends CrudRepository<Users, Integer>{

	public Users findByeMail(String eMail);
	public Users findByUserId(int ownerId);
}
