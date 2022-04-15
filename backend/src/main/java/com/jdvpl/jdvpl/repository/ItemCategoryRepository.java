package repository;

import model.ItemCategoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ItemCategoryRepository extends MongoRepository<ItemCategoryModel, String> {
}
