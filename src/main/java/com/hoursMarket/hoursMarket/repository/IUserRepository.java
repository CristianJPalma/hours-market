package com.hoursMarket.hoursMarket.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository<User, Integer> 
		extends IBaseRepository<User, Integer>{

}
