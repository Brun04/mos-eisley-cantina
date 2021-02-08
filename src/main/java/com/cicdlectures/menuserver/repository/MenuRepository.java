package com.cicdlectures.menuserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cicdlectures.menuserver.model.Menu;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Long> {
}
