

package com.seryozha.model.repository;

import com.seryozha.model.entity.Calorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface CalorieRepository extends JpaRepository<Calorie, UUID> {

}
