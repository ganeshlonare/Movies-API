package dev.ganesh.movies.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUp {
    private ObjectId id;
    private String username;
    private String email;
    private String password;
    private LocalDateTime created;
    private LocalDateTime updated;

    public SignUp(String username, String email, String password, LocalDateTime created, LocalDateTime updated) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.created = created;
        this.updated = updated;
    }
}
