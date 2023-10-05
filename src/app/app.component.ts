import { Component } from '@angular/core';
import { interval } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'watch';

  interval:any;
  time = new Date();
  startTimer()
  {
    this.interval =setInterval(() => {
      this.time.setSeconds(this.time.getSeconds() +1);
    })
  }

  pauseTimer()
  {
    clearInterval(this.interval)
  }
  resetTimer()
  {
    this.time.setSeconds(0);
  }
}
