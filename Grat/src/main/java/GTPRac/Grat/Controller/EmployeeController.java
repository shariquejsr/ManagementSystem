package GTPRac.Grat.Controller;
import GTPRac.Grat.Entity.Employess;
import GTPRac.Grat.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class EmployeeController {

    //Controller code written here

    @Autowired
    EmployeeService serv;

    //create Employee
    @PostMapping("/api/create")
    public ResponseEntity<String> createEmployee(@RequestBody Employess emp){
        serv.saveEmployee(emp);
        return ResponseEntity.ok("Employee created successfully");
    }

    // Get Employee
    @GetMapping("/api/getEmployee")
    public ResponseEntity<Employess>getEmployeeById(@RequestParam  int id){
      Optional<Employess> emp= serv.getEmployeeById(id);
       if(emp.isPresent()){
           return ResponseEntity.ok(emp.get());
       } else {
           return ResponseEntity.notFound().build();
       }
    }

    @PutMapping("/api/update")
    public ResponseEntity<String> updateEmployee(@RequestBody Employess emp){
        serv.updateEmployee(emp);
        return ResponseEntity.ok("Employee updated successfully");
    }

    @DeleteMapping("/api/delete")
    public ResponseEntity<String> deleteEmployee( @RequestParam int id){
        serv.deleteEmpployee(id);
        return ResponseEntity.ok("Employee deleted successfully");
    }

}
