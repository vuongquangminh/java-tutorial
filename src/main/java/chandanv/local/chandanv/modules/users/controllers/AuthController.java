package chandanv.local.chandanv.modules.users.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chandanv.local.chandanv.modules.users.dtos.LoginRequest;
import chandanv.local.chandanv.modules.users.dtos.LoginResponse;
import chandanv.local.chandanv.modules.users.services.interfaces.UserServiceInterface;




@RestController
@RequestMapping("/v1/auth")
public class AuthController {
    
    private final UserServiceInterface userService;
    
    public AuthController(UserServiceInterface userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {

        LoginResponse auth = userService.login(request);
        return ResponseEntity.ok(auth);
    }


}
