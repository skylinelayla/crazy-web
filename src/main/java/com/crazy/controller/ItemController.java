package com.crazy.controller;

import com.crazy.model.Item;
import com.crazy.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

/**
 * Created by SHIKUN on 2016/9/9.
 */

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemRepository repository;

    @RequestMapping(method = RequestMethod.POST)
    public Item addItem(@RequestBody Item item) {
        item.setId(null);
        return repository.saveAndFlush(item);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Item> getAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Item updateItem(@RequestBody Item updatedItem, @PathVariable Integer id) {
        Item item = repository.getOne(id);
        item.setChecked(updatedItem.isChecked());
        item.setDescription(updatedItem.getDescription());
        return repository.saveAndFlush(item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteItem(@PathVariable Integer id) {
        repository.delete(id);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = { EmptyResultDataAccessException.class, EntityNotFoundException.class })
    public void handleNotFound() { }

}


