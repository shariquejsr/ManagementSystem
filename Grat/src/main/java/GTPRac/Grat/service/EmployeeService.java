package GTPRac.Grat.service;


import GTPRac.Grat.Entity.Employess;
import GTPRac.Grat.Repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private RepositoryInterface repo;

    //save Employee
    public String saveEmployee(Employess employee) {
        repo.save(employee);
        return  "Employee saved sucessfully";
    }

    //get Employee by id
    public Optional<Employess> getEmployeeById(int id){
        return repo.findById(id);
    }

    //update Employee
    public String updateEmployee(Employess employee){
        repo.save(employee);
        return "Employee updated successfully";
    }

    //delete Employee
    public String deleteEmpployee(int id){
        repo.deleteById(id);
        return "Employee deleted successfully";
    }


}
