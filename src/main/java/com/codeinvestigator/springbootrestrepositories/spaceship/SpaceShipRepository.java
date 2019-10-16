package com.codeinvestigator.springbootrestrepositories.spaceship;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = true)
public interface SpaceShipRepository extends PagingAndSortingRepository<SpaceShip,String> {
}
