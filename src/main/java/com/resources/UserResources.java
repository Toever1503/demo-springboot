package com.resources;

import com.entities.base.User;
import com.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@Transactional
@RequestMapping("/user")
@RestController
public class UserResources {

    private final UserRepository userRepository;

    public UserResources(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public Object create(@RequestBody User user){
        this.userRepository.saveAndFlush(user);
        return user;
    }

    @PutMapping("/{id}")
    public Object update(@PathVariable Long id, @RequestBody User user){
        user.setId(id);
        this.userRepository.saveAndFlush(user);
        return user;
    }

    @GetMapping("/{id}")
    public Object get(@PathVariable Long id){
        return this.userRepository.findById(id);
    }
}
