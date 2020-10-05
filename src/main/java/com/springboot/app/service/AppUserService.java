package com.springboot.app.service;

import com.springboot.app.entity.AppUser;
import com.springboot.app.repository.AppUserRepository;
import org.springframework.stereotype.Service;

@Service
public class AppUserService extends CrudService<AppUser, Long, AppUserRepository> {

    protected AppUserService(AppUserRepository repository) {
        super(repository);
    }

    public AppUser update(Long userId, AppUser user) {
        user.setId(userId);
        return repository.save(user);
    }
}
