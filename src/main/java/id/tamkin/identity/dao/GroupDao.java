package id.tamkin.identity.dao;

import id.tamkin.identity.entity.Group;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GroupDao extends PagingAndSortingRepository<Group, String> {
}
