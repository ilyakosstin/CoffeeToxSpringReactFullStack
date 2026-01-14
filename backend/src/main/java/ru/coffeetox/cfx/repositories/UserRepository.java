package ru.coffeetox.cfx.repositories;

import ru.coffeetox.cfx.models.User;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

    @Modifying
    @Query("update user set balance = :balance where id = :id")
    void setBalance(@Param("id") Long id, @Param("name") String name);


}
