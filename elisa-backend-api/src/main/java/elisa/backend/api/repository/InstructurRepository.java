package elisa.backend.api.repository;

import elisa.backend.api.model.Instructur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructurRepository extends JpaRepository<Instructur,Long> {

}
