package mittal.shivam.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mittal.shivam.user.entity.User;
import mittal.shivam.user.repository.UserRepository;
import mittal.shivam.user.valueobject.Department;
import mittal.shivam.user.valueobject.UserResponseTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final WebClient.Builder webClientBuilder;

    public User addUser(User user) {
        log.info("Inside addUser of UserService");
        return userRepository.save(user);
    }

    public UserResponseTemplate getUser(Long userId) {
        log.info("Inside getUser of UserService");
        User user = userRepository.findByUserId(userId);

        Department department = webClientBuilder.build()
                .get()
                .uri("http://DEPARTMENT-SERVICE/departments/get/{departmentId}", user.getDepartmentId())
                .retrieve()
                .bodyToMono(Department.class)
                .block();

        return new UserResponseTemplate(user, department);
    }
}