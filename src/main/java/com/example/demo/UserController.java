package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    /**
     * GET /users
     * <br><br>
     * Returns user
     */
    @GetMapping("/users")
    public List<User> getAllUsers() {

        List<Long> idsToLookFor = new ArrayList<>();
        // come up with 2000 ids. I'm hopeful it won't matter that the IDs are he same every time.
        // If it does, you may need to make random IDs here and populate more records in the table
        for ( long i = 0; i < 2000; i++) {
            idsToLookFor.add(i);
        }
        return userRepository.findAllByIdIn(idsToLookFor);
    }
}
