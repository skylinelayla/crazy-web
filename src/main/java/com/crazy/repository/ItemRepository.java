package com.crazy.repository;

import com.crazy.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by SHIKUN on 2016/9/9.
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {
    @Query("SELECT i FROM Item i WHERE i.checked=true")
    List<Item> findChecked();

}

