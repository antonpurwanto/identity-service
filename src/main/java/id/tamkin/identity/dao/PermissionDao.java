package id.tamkin.identity.dao;

import id.tamkin.identity.entity.Permission;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PermissionDao extends PagingAndSortingRepository<Permission, String> {
}
