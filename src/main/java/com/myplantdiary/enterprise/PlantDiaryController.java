package com.myplantdiary.enterprise;

import com.myplantdiary.enterprise.dto.Specimen;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String index(@PathVariable("id") String id) {
        String id_stuff = id;
        Specimen specimen = new Specimen();
        return "start";
    }

    @RequestMapping("/invalid")
    public ResponseEntity invalid() {
        return new ResponseEntity(HttpStatus.FORBIDDEN);

    }

}
