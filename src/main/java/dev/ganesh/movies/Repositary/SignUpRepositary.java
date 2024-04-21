package dev.ganesh.movies.Repositary;

import dev.ganesh.movies.Collection.SignUp;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepositary extends MongoRepository<SignUp, ObjectId> {
}
