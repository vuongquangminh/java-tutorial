package chandanv.local.chandanv.modules.users.services.impl;

import org.springframework.stereotype.Service;

import chandanv.local.chandanv.modules.users.dtos.LoginRequest;
import chandanv.local.chandanv.modules.users.dtos.LoginResponse;
import chandanv.local.chandanv.modules.users.dtos.UserDTO;
import chandanv.local.chandanv.modules.users.services.interfaces.UserServiceInterface;
import chandanv.local.chandanv.services.BaseService;


@Service
public class UserService extends BaseService implements UserServiceInterface {
    
    @Override
    public LoginResponse login(LoginRequest request) {
        try {
            String email = request.getEmail();
            String password = request.getPassword();

            String token = "randomToken";
            UserDTO user = new UserDTO(1L, email);
            return new LoginResponse(token, user);

        } catch (Exception e) {
            // Handle exceptions appropriately
            throw new RuntimeException("Login failed: " + e.getMessage(), e);
        }   
    }
    
}
