package rim.job.afa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import rim.job.afa.domain.Authority;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {}
