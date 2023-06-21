import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_PATH } from 'src/env/environment';
import { ISecao } from './ISecao';

@Injectable({
  providedIn: 'root'
})
export class SecaoService {

  constructor(private httpClient: HttpClient) { }

  obterTodos() {
    return this.httpClient.get<ISecao[]>(`${API_PATH}secoes`).toPromise();
  }
}
