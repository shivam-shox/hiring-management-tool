package com.boot.controller;

import com.boot.model.Hiring;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ShipwrekController {

    @RequestMapping(value="hiring", method = RequestMethod.GET)
    public List<Hiring> list() {
        return ShipwreckStub.list();
    }

    @RequestMapping(value="hiring/{id}", method = RequestMethod.POST)
    public Hiring create(@RequestBody Hiring shipwreck) {
        return ShipwreckStub.create(shipwreck);
    }

    @RequestMapping(value="hiring/{id}", method = RequestMethod.GET)
    public Hiring get(@PathVariable Long id) {
        return ShipwreckStub.get(id);
    }

    @RequestMapping(value="hiring/{id}", method = RequestMethod.PUT)
    public Hiring update(@PathVariable Long id, @RequestBody Hiring shipwreck) {
        return ShipwreckStub.update(id, shipwreck);
    }

    @RequestMapping(value="hiring/{id}", method = RequestMethod.DELETE)
    public Hiring delete(@PathVariable Long id) {
        return ShipwreckStub.delete(id);
    }


}
