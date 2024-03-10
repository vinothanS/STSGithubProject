package projectmanagement.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectmanagement.projectmanagement.entity.Project;


@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
}
