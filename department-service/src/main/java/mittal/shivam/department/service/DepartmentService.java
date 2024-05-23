package mittal.shivam.department.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mittal.shivam.department.entity.Department;
import mittal.shivam.department.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    public Department addDepartment(Department department) {
        log.info("Inside addDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department getDepartment(Long departmentId) {
        log.info("Inside getDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
