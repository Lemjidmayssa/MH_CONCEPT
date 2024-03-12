package com.example.MH_CONCEPT.service;

import com.example.MH_CONCEPT.entity.User;
import com.example.MH_CONCEPT.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public String saveUser(User user) {
        if (null != user) {
          Optional<User> user1 =  userRepo.findById(user.getId());
          if (user1.isPresent()) {
              throw new RuntimeException("User existe déjà");
          }
            userRepo.save(user);
        }
        return user.getId();
    }

    public String deleteUser(String id) {
        if (null != id) {
            userRepo.deleteById(id);
        }
        return id;
    }

    public String updateUser(String id, User user) throws Exception {
        if (null != id) {
            Optional<User> userFound = userRepo.findById(id);
            if (userFound.isPresent()) {
                User userToSet = new User();
                userToSet.setId(id);
                userToSet.setMail(user.getMail());
                userToSet.setAddress(user.getAddress());
                userToSet.setDescription(user.getDescription());
                userToSet.setLandLine(user.getLandLine());
                userToSet.setMobilePhone(user.getMobilePhone());
                userToSet.setCompanyName(user.getCompanyName());
                userRepo.save(userToSet);
            } else {
                throw new Exception("user not found");
            }
        }
        return id;
    }

    public Optional<User> getUser(String id) {
        return id != null ? userRepo.findById(id) : null;
    }

}
