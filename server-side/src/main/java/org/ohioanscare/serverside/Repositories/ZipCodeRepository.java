package org.ohioanscare.serverside.Repositories;

import org.ohioanscare.serverside.Models.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {
    ZipCode findByZipCodeContains(String zipCode);
}
