package H2AndUUID.Student;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuReposit extends JpaRepository<StuEntity, UUID> {

}
