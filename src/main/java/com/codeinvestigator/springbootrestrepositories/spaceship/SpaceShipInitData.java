package com.codeinvestigator.springbootrestrepositories.spaceship;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SpaceShipInitData {
    private final SpaceShipRepository spaceShipRepository;

    public SpaceShipInitData(SpaceShipRepository spaceShipRepository) {
        this.spaceShipRepository = spaceShipRepository;
    }

    @PostConstruct
    public void createShips(){
        spaceShipRepository.deleteAll();
        spaceShipRepository.saveAll(
                List.of(
                        new SpaceShip(null,"Blackbird", 10),
                        new SpaceShip(null,"Swan", 20),
                        new SpaceShip(null,"Stork", 123),
                        new SpaceShip(null,"Duck", 24),
                        new SpaceShip(null,"Eagle", 69)
                )
        );
    }
}
