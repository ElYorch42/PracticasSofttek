import { Component, Input } from '@angular/core';
import { User } from '../_modelo/User';

@Component({
  selector: 'app-profile-card',
  standalone: true,
  imports: [],
  templateUrl: './profile-card.component.html',
  styleUrl: './profile-card.component.css'
})
export class ProfileCardComponent {
  bgColor = 'indigo';

  @Input() user: User | undefined;

  handleClick() {
    this.bgColor = 'tomato';
  }
  
}
