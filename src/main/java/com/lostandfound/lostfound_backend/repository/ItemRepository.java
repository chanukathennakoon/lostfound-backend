package com.lostandfound.lostfound_backend.repository;

import com.lostandfound.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
