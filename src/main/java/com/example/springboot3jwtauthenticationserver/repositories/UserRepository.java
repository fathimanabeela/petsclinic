package com.example.springboot3jwtauthenticationserver.repositories;


import com.example.springboot3jwtauthenticationserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

//    @Query(value = "select o.email as email,string_agg(p.type,',') as pets from users o left join pets p on o.id=p.user_id  group by o.emai",nativeQuery = true)
//    List<UserPetsDTO> getPetsByAuthenticatedUser(String name);
}
