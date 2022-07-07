package spring.com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.com.example.springapp.entities.Biodata;
import spring.com.example.springapp.services.Bioservice;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private Bioservice bioservice;

    @GetMapping("/home")
    public String home()
    {
        return "This is controller class and home";
    }

    @GetMapping("/getBiodata")
    public List<Biodata> getBiodata()
    {
       return this.bioservice.getBiodata();
    }

    @GetMapping("/getBiobyId/{id}")
    public Biodata getBiodatabyId(@PathVariable int id)
    {
        return bioservice.getBiodataById(id);
    }

    @GetMapping("/addBiodata")
    public ResponseEntity<HttpStatus> addBiodata(@RequestBody Biodata biodata)
    {
        try{
            bioservice.addBiodata(biodata);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
