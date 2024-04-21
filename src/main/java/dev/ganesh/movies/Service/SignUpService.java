package dev.ganesh.movies.Service;

import dev.ganesh.movies.Collection.SignUp;
import dev.ganesh.movies.Repositary.SignUpRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SignUpService {

    @Autowired
    private SignUpRepositary signUpRepositary;

    public SignUp signUp(String username, String email, String password) {
        SignUp signUp = new SignUp(username, email, password, LocalDateTime.now(), LocalDateTime.now());
        return signUpRepositary.save(signUp);
    }
}
