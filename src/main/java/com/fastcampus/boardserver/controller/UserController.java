package com.fastcampus.boardserver.controller;

import com.fastcampus.boardserver.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Log4j2
@AllArgsConstructor
public class UserController {
    private final UserServiceImpl userService;

}