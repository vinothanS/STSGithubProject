import { Component,OnInit} from '@angular/core';
import { Title } from '@angular/platform-browser';
import { ProjectsService } from '../_services/projects.service';
import { Project } from '../_models/project';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  featuredProject ={} as Project;

  constructor(private titleService:Title,private projectService:ProjectsService)
  {
    this.titleService.setTitle("Vinothan - Home");
  }
 ngOnInit(): void {
   this.featuredProject=this.projectService.getProjectById(0);
 }
 images = [944, 1011, 984].map((n) => `https://picsum.photos/id/${n}/900/500`);
}
