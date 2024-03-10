package projectmanagement.projectmanagement.services;

import projectmanagement.projectmanagement.Error.ProjectNotFoundException;
import projectmanagement.projectmanagement.entity.Project;

import java.util.List;

public interface ProjectService {
  public Project createProject(Project project);

  public List<Project> fetchAllProject();

 public Project fetchProjectById(Long id) throws ProjectNotFoundException;

 public void deleteProjectById(Long id);

  public Project updateProjectById(Long id, Project project);
}
