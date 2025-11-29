package GTPRac.Grat.Repository;

import GTPRac.Grat.Entity.Employess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryInterface extends JpaRepository<Employess,Integer> {
}
