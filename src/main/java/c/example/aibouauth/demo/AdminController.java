package c.example.aibouauth.demo;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @GetMapping
    public  String get(){
        return "GET ::ADMIN CONTROLLER";
    }
    @PostMapping
    public  String  post(){
        return "Post ::ADMIN CONTROLLER";
    }
   @PutMapping
    public  String put(){
        return "PUT ::ADMIN CONTROLLER";
    }
    @DeleteMapping
    public  String Delete(){
        return "DELETE ::ADMIN CONTROLLER";
    }

}
