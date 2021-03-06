package com.sbb.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.sbb.entity.UserEntity;

public interface UserRepository  extends CrudRepository<UserEntity, Integer> {

    @Query("SELECT usr FROM UserEntity usr WHERE LOWER(usr.userName) = LOWER(:userName) AND usr.password = (:password)")
    public UserEntity findByUserName(@Param("userName") String userName, @Param("password") String password);

}
