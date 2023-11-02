package cat.udl.eps.softarch.myroutes.repository;

import cat.udl.eps.softarch.myroutes.domain.RouteVersion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource
public interface RouteVersionRepository extends CrudRepository<RouteVersion, Long>, PagingAndSortingRepository<RouteVersion, Long> {

}