package com.springboot.app.controllers;

import com.springboot.app.entity.AppUser;
import com.springboot.app.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private final AppUserService service;

    @Autowired
    public UserController(AppUserService service) {
        this.service = service;
    }

    @GetMapping("{userId}")
    public AppUser get(@PathVariable("userId") long userId) {
        return service.get(userId);
    }

    @GetMapping
    public List<AppUser> getAll() {
        return service.getAll();
    }

    @PostMapping
    public AppUser save(@RequestBody AppUser user) {
        return service.save(user);
    }

    @PutMapping("{userId}")
    public AppUser update(@PathVariable("userId") long userId, @RequestBody AppUser user) {
        return service.update(userId, user);
    }

    @DeleteMapping("{userId}")
    public void delete(@PathVariable("userId") long userId) {
        service.delete(userId);
    }
}
