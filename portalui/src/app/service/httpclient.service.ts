import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Portal{
  constructor(
    // tslint:disable-next-line: ban-types
    public id: string,
    public message: string,
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private httpClient: HttpClient
  ) {}

     getPortalMessages()
  {
    console.log('Portal Call');
    return this.httpClient.get<Portal[]>('http://localhost:8089/api/portal/portalservice');
  }
}
