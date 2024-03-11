package com.audichya.SimpleMart.Database;

import com.audichya.SimpleMart.Model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemsRepository extends MongoRepository<Item,Integer> {

}
