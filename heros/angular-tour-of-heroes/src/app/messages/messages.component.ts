import { Component } from '@angular/core';
import { MessageService } from '../message.service';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-messages',
  standalone: true,
  imports: [AppComponent],
  templateUrl: './messages.component.html',
  styleUrl: './messages.component.css'
})
export class MessagesComponent {

  constructor(public messageService: MessageService) {}

}
