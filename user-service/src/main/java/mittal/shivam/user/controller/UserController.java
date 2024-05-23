package mittal.shivam.user.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mittal.shivam.user.entity.User;
import mittal.shivam.user.service.UserService;
import mittal.shivam.user.valueobject.UserResponseTemplate;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        log.info("Inside addUser of UserController");
        return userService.addUser(user);
    }

    @GetMapping("/get/{userId}")
    public UserResponseTemplate getUser(@PathVariable Long userId) {
        log.info("Inside getUser of UserController");
        return userService.getUser(userId);
    }
}
