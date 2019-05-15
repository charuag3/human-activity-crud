package com.ha.crud.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ha.crud.entity.SensorData;

/**
 * This SensorDataRepo will provide the basic crud functionality
 * @author charuag3
 *
 */
public interface SensorDataRepo extends CrudRepository<SensorData, Integer>{
	@Query(value = "select * from human_activity sd where sd.create_time>:givenTime", nativeQuery = true)
    public Iterable<SensorData> findByDate(String givenTime);
}
