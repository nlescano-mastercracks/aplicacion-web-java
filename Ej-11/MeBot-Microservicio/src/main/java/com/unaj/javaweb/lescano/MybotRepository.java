package com.unaj.javaweb.lescano;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MybotRepository extends CrudRepository<User, Long> {

}
