package com.solvd.api;

import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.IAbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.Test;

public class DogBreedAPITest implements IAbstractTest {
    private final static Logger LOGGER = LogManager.getLogger(DogBreedAPITest.class);

    @Test()
    public void getAll_retrievesAllBreeds() {
        LOGGER.info("test");
        GetAllBreeds getAllBreeds = new GetAllBreeds();
        getAllBreeds.callAPIExpectSuccess();
        getAllBreeds.validateResponseAgainstSchema("breeds/_get/rs.schema");
    }

    @Test()
    public void getByBreed_retrievesBreed() {

        LOGGER.info("test");
        GetByBreed getByBreed = new GetByBreed();
        getByBreed.callAPIExpectSuccess();
        getByBreed.validateResponseAgainstSchema("breeds/_getByBreed/rs.schema");
    }

    @Test
    public void getBreedByNull_returnsError() {
        LOGGER.info("test");
        GetByBreedNull getByBreedNull = new GetByBreedNull();
        getByBreedNull.callAPI();
        getByBreedNull.expectResponseStatus(HttpResponseStatusType.NOT_FOUND_404);
    }

    @Test
    public void getRandomBreed_returnsRandom() {
        LOGGER.info("test");
        GetRandomBreed getByRandom = new GetRandomBreed();
        getByRandom.callAPIExpectSuccess();
        getByRandom.validateResponseAgainstSchema("breeds/_getRandomBreed/rs.schema");
    }

    @Test
    public void getSubBreedByBreed_returnsSubBreedsInList() {
        LOGGER.info("test");
        GetSubBreedsByBreed getSubBreedsByBreed = new GetSubBreedsByBreed();
        getSubBreedsByBreed.callAPIExpectSuccess();
        getSubBreedsByBreed.validateResponseAgainstSchema("breeds/_getSubBreedByBreed/rs.schema");
    }

    @Test
    public void getSubBreedByNull_returnsError() {
        LOGGER.info("test");
        GetSubBreedNull getSubBreedNull = new GetSubBreedNull();
        getSubBreedNull.callAPI();
        getSubBreedNull.expectResponseStatus(HttpResponseStatusType.NOT_FOUND_404);
    }

}