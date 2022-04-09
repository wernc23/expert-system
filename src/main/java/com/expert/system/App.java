package com.expert.system;

import com.expert.system.models.Rock;
import com.expert.system.services.RockIdService;
import com.expert.system.services.RockTypeService;

/**
 * Hello world!
 *
 */
public class App {
    private static Rock rock = new Rock();
    private static RockTypeService rockTypeService = new RockTypeService(rock);
    private static RockIdService rockIdService = new RockIdService(rock);

    public static void main(String[] args) {
        rockTypeService.getRockType();
        rockIdService.getRockId();


    }

}
