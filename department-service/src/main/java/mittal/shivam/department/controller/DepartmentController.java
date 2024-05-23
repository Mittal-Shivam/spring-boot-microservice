package mittal.shivam.department.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mittal.shivam.department.entity.Department;
import mittal.shivam.department.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department) {
        log.info("Inside addDepartment of DepartmentController");
        return departmentService.addDepartment(department);
    }

    @GetMapping("/get/{departmentId}")
    public Department getDepartment(@PathVariable Long departmentId) {
        log.info("Inside getDepartment of DepartmentController");
        return departmentService.getDepartment(departmentId);
    }
}
