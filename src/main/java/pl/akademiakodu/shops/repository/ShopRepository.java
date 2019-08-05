package pl.akademiakodu.shops.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.akademiakodu.shops.model.Shop;

import java.util.List;

public interface ShopRepository extends CrudRepository<Shop,Integer> {

    @Query(
            value = "SELECT * FROM shop s WHERE UPPER(s.name) = :name OR LOWER(s.name) = :name",
            nativeQuery = true)
    List<Shop> findShopsByName(@Param("name") String name);

}
