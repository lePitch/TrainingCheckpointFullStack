package com.fullcheckpoint.mrWhite.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MenuService {
    @Autowired MenuRepository repository;

    public Optional<Menu> getMenu(Long id){
        return repository.findById(id);
    }

    public void newMenu(Menu menu){
        repository.save(menu);
    }

    public void editMenu(Menu menu, Long id){
        Menu newMenu = menu;
        newMenu.setId(id);
        repository.save(newMenu);
    }

    public void deleteMenu(Long id){
        repository.deleteById(id);
    }
}
