package chandanv.local.chandanv.databases.seeder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;



    @Override
    public void run(String... args) throws Exception {
        if(isTableEmpty()) {
            System.out.println("User seeding...");
            
        } 
    }    

    private boolean isTableEmpty() {
        Long count = (Long) entityManager.createQuery("SELECT COUNT(e) FROM users e").getSingleResult();
        return count == 0;
    }
}
