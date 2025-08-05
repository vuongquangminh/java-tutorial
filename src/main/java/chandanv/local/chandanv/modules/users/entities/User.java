package chandanv.local.chandanv.modules.users.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity(name = "users")
public class User {
    @Id 
    private Long id;
    private Long user_catalog_id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String image;

}
