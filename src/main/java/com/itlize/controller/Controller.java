package com.itlize.controller;


import com.itlize.service.NumberChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/number")
public class Controller {

    @Autowired
    NumberChangeService numberChangeService;

    @GetMapping(value = "/change/{number}")
    public ResponseEntity<?> NumberChange(@PathVariable("number") String number){
        if (number.length() != 10) {
            return ResponseEntity.ok("Number length is wrong");
        }

        return ResponseEntity.ok(numberChangeService.change(number));
    }

}
