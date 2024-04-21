package dev.ganesh.movies.Controller;

import dev.ganesh.movies.Collection.SignUp;
import dev.ganesh.movies.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/signup")
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @PostMapping()
    public ResponseEntity<?> signUp(@RequestBody SignUpRequest signUpRequest) {
        try {
            SignUp signUp = signUpService.signUp(signUpRequest.getUsername(), signUpRequest.getEmail(), signUpRequest.getPassword());
            return ResponseEntity.ok("User signed up successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to sign up user");
        }
    }

    static class SignUpRequest {
        private String username;
        private String email;
        private String password;

        // Getters and setters
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
