package me.dio.service.impl;

import me.dio.domain.model.User;
import me.dio.repository.UserRepository;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class userServiceImpl implements UserService {

    private final UserRepository userRepository;

    public userServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);


    }

    @Override
    public User create(User userToCreate) throws IllegalAccessException {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {

            throw new IllegalAccessException("This Account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
