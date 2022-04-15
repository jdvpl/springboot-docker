package com.jdvpl.jdvpl.repository;

import com.jdvpl.jdvpl.model.ItemCategoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ItemCategoryRepository extends MongoRepository<ItemCategoryModel, String> {
}
