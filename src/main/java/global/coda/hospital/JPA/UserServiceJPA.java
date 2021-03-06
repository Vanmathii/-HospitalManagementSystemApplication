package global.coda.hospital.JPA;
import java.util.List;  
import java.util.Optional;  
import java.util.ArrayList;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
@Service  
public class UserServiceJPA {  
    @Autowired  
    private UserRepository userRepository;  
    public List<UserRecord> getAllUsers(){  
        List<UserRecord>userRecords = new ArrayList<>();  
        userRepository.findAll().forEach(userRecords::add);  
        return userRecords;  
    }  
    public Optional<UserRecord> getUser(Integer id){  
        return userRepository.findById(id);  
    }  
    public void addUser(UserRecord userRecord){  
        userRepository.save(userRecord);  
    }  
    public void delete(Integer id){  
        userRepository.deleteById(id);  
    }  
}  
