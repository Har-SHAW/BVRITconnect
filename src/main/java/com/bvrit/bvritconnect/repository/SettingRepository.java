package com.bvrit.bvritconnect.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bvrit.bvritconnect.model.Setting;

@Repository
public interface SettingRepository extends JpaRepository<Setting,Long>{
	Optional<Setting> findById(Long id);
	Setting findByUserId(Long userId);

}
