package com.myplantdiary.enterprise;

import com.myplantdiary.enterprise.dto.Specimen;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * The controller for Plant Diary REST endpoints and web UI.
 * <p>
 * This class handles the CRUD operations for My Plant Diary specimens, via HTTP actions.
 * </p>
 * <p>
 *  This class also serves HTML based web pages, for UI interactions with plant specimens.
 * </p>
 * @author Brandan Jones
 */
@Controller
public class PlantDiaryController {

    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "start";
    }

    @RequestMapping("/lookup/{id}/")
    public ResponseEntity index(@PathVariable("id") String id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        ResponseEntity responseEntity = new ResponseEntity("Your number: " + id, headers, HttpStatus.FORBIDDEN);
        return responseEntity;
    }

    @RequestMapping("/start")
    public String startPage() {
        return "start";
    }

    @RequestMapping("/invalid")
    public ResponseEntity invalid() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        ResponseEntity responseEntity = new ResponseEntity("Foo", headers, HttpStatus.FORBIDDEN);
        return responseEntity;
    }

    @RequestMapping("/valid")
    public ResponseEntity valid() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        ResponseEntity responseEntity = new ResponseEntity("Foo", headers, HttpStatus.OK);
        return responseEntity;
    }


    @RequestMapping("/validJson")
    public ResponseEntity validJson() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity responseEntity = new ResponseEntity("{name:Foo}", headers, HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping("/jsonObject")
    @ResponseBody
    public Specimen getSpecimenObject() {
        Specimen specimen = new Specimen();
        specimen.setPlantId("83");
        specimen.setSpecimenId("1002");
        specimen.setLatitude("39.74");
        specimen.setLongitude("-84.51");
        specimen.setDescription("A native tree with delicious fruit");
        return specimen;
    }

    /**
     * Create a new specimen object, given the data provided.
     *
     * Returns one of the following status codes:
     * 201: successfully created a new specimen.
     * 409: unable to create specimen, because it already exists.
     *
     * @param specimen a JSON representation of a specimen object.
     * @return the newly created specimen object.
     */
    @PostMapping(
            value = "/createSpecimen", consumes = "application/json", produces = "application/json")
    public Specimen createSpecimen(@RequestBody Specimen specimen) {
        int i = 1 + 1;
        return specimen;
    }


}
