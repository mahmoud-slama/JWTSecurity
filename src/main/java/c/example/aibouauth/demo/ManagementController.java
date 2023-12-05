package c.example.aibouauth.demo;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/management")
public class ManagementController {

    @GetMapping
    public  String get(){
        return "GET ::managementCONTROLLER";
    }
    @PostMapping
    public  String  post(){
        return "Post ::management CONTROLLER";
    }
   @PutMapping
    public  String put(){
        return "PUT ::managementCONTROLLER";
    }
    @DeleteMapping
    public  String Delete(){
        return "DELETE ::management CONTROLLER";
    }

}
