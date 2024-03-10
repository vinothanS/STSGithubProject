package projectmanagement.projectmanagement.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectmanagement.projectmanagement.Error.ProjectNotFoundException;
import projectmanagement.projectmanagement.entity.Project;
import projectmanagement.projectmanagement.repository.ProjectRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService{


    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> fetchAllProject() {
        return projectRepository.findAll();
    }

    @Override
    public Project fetchProjectById(Long id) throws ProjectNotFoundException {
        Optional<Project> project= projectRepository.findById(id);

        if(!project.isPresent())
        {
            throw  new ProjectNotFoundException("project not available");
        }

        return project.get();
    }

    @Override
    public void deleteProjectById(Long id) {
         projectRepository.deleteById(id);
    }

    @Override
    public Project updateProjectById(Long id, Project project) {
        Project pc = projectRepository.findById(id).get();
        if (Objects.nonNull(project.getName()) && !"".equalsIgnoreCase(project.getName())) {
            pc.setName(project.getName());
        }

        if (Objects.nonNull(project.getDescription()) && !"".equalsIgnoreCase(project.getDescription())) {
            pc.setName(project.getDescription());
        }

        if (Objects.nonNull(project.getPriority()) && !"".equalsIgnoreCase(project.getPriority())) {
            pc.setName(project.getPriority());
        }

        if (Objects.nonNull(project.getStartDate()) && !"".equalsIgnoreCase(
                String.valueOf(project.getStartDate()))) {
            pc.setName(String.valueOf(project.getStartDate()));
        }

        if (Objects.nonNull(project.getEndDate()) && !"".equalsIgnoreCase(
                String.valueOf(project.getEndDate()))) {
            pc.setName(String.valueOf(project.getEndDate()));
        }

        return projectRepository.save(pc);

    }

}
