package chandanv.local.chandanv.modules.users.services.interfaces;
import chandanv.local.chandanv.modules.users.dtos.LoginRequest;
import chandanv.local.chandanv.modules.users.dtos.LoginResponse;
public interface UserServiceInterface {
    
    LoginResponse login(LoginRequest request);

}
