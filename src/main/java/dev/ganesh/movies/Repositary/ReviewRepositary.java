package dev.ganesh.movies.Repositary;

import dev.ganesh.movies.Collection.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepositary extends MongoRepository <Review, ObjectId> {
}
