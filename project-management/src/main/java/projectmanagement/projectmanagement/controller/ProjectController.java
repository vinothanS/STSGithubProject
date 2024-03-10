package projectmanagement.projectmanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projectmanagement.projectmanagement.Error.ProjectNotFoundException;
import projectmanagement.projectmanagement.entity.Project;
import projectmanagement.projectmanagement.services.ProjectService;

import java.util.List;

@RestController
public class ProjectController {


    @Autowired

    private ProjectService projectService;



    @PostMapping("/project")
    public Project createProject(@RequestBody Project project)
    {
         return projectService.createProject(project);
    }

    @GetMapping("/project")

    public List<Project> fetchAllProject()
    {
        return  projectService.fetchAllProject();
    }

    @GetMapping("/project/{id}")

    public Project fetchProjectById(@PathVariable("id") Long id) throws ProjectNotFoundException {

        return projectService.fetchProjectById(id);

    }

    @DeleteMapping("project/{id}")

    public String deleteProjectById(@PathVariable("id") Long id)
    {

        projectService.deleteProjectById(id);
        return "Deleted Successfully";
    }


    @PutMapping("project/{id}")

    public Project updateProjectById(@PathVariable("id")Long id,@RequestBody
                                     Project project)
    {

        return  projectService.updateProjectById(id,project);
    }
}
