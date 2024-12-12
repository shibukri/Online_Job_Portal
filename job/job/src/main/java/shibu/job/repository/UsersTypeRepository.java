package shibu.job.repository;

import shibu.job.entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersTypeRepository extends JpaRepository<UsersType, Integer> {
}