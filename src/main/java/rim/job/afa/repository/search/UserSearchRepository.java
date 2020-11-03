package rim.job.afa.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import rim.job.afa.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {}
