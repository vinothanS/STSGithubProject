import { Injectable } from '@angular/core';
import { Project } from '../_models/project';
import { Tag } from '../_models/Tag';

@Injectable({
  providedIn: 'root'
})
export class ProjectsService {
  projects: Project[] = [
    {id:0,name:"Sample Angular App",pictures:[],projectLink:"//www.github.com",summary:"full stack eb development using Angular and NodeJS",description:"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",tags:[Tag.ANGULAR,Tag.TYPESCRIPT]}, 
    {id:1,name:"Sample python project",pictures:[],projectLink:"//WWW.github.com",summary:"python project that analyze the stock market data",description:"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",tags:[Tag.PYTHON] },
    {id:2,name:"Sample.NET App",pictures:[],projectLink:"//www.githubcom",summary:"Full stack web app devloped using React andASP.NET",description:"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",tags:[Tag.REACT,Tag.ASPNET]},
    {id:3,name:"Web ApI Project",pictures:[],projectLink:"//www.github.com",summary:"Web API project was developed for a class object",description:"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",tags:[Tag.JAVA,Tag.ANGULAR]},
    {id:4,name:"Chrome Extension",pictures:[],projectLink:"//www.github.com",summary:"Developed a Chrome Extension that tracks the rate o furniture",description:"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",tags:[Tag.JAVASCRIPT]},
    {id:5,name:"Mobile App",pictures:[],projectLink:"//www.github.com",summary:"Mobile app developed in java that tracks the departure and arrival of trains",description:"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",tags:[Tag.JAVA]}

  ];

  constructor() { }
  getProjects()
  {
    return this.projects;
  }

  getProjectById(id: number): Project
  {
   let project =this.projects.find(project => project.id === id);
   if(project === undefined)
   {
    throw new TypeError("Thereis no project that matches the id" + id);
   }
   return project;
  }

}
