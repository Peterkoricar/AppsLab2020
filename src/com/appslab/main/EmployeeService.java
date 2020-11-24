package com.appslab.main;

import com.appslab.model.Job;
import java.util.List;

public interface EmployeeService {
    float totalSalary(List<Job> list);
    int totalBonus(List<Job> list);
}
