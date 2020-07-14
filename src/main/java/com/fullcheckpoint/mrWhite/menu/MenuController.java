package com.fullcheckpoint.mrWhite.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired MenuService service;

    @GetMapping("/{id}")
    public Optional<Menu> getMenu(@PathVariable Long id){
        return service.getMenu(id);
    }

    @PutMapping("/{id}")
    public void editMenu(@RequestBody Menu menu, @PathVariable Long id){
        service.editMenu(menu, id);
    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable Long id){
        service.deleteMenu(id);
    }

}
