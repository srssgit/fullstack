import { Component, OnInit } from '@angular/core';
import { HttpClientService } from '../service/httpclient.service';

@Component({
  selector: 'app-portal',
  templateUrl: './portal.component.html',
  styleUrls: ['./portal.component.sass']
})
export class PortalComponent implements OnInit {

  portalMessages: string[];
  constructor(
    private httpClientService: HttpClientService
  ) { }

  ngOnInit() {
    this.httpClientService.getPortalMessages().subscribe(response => this.handleSuccessfulResponse(response),
     );
  }
  handleSuccessfulResponse(response) {
    this.portalMessages = response;
  }

}
