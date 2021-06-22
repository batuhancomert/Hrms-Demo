package kodlama.io.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HRMS.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {

	boolean existsBySkillName(String skill);
}
