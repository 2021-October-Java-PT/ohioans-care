package org.ohioanscare.serverside.Repositories;

import org.ohioanscare.serverside.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserContainsIgnoreCase(String user);
}
