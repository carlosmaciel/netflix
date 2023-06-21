import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_PATH } from 'src/env/environment';
import { ITitulo } from './ITitulo';

@Injectable({
  providedIn: 'root'
})
export class TituloService {

  constructor(private httpClient: HttpClient) { }

  obterTodos() {
    return this.httpClient.get<ITitulo[]>(`${API_PATH}titulos`).toPromise();
  }

  obterById(id: number) {
    return this.httpClient.get<ITitulo>(`${API_PATH}titulos/${id}`).toPromise();
  }

  adicionar(titulo: ITitulo) {
    return this.httpClient.post<ITitulo>(`${API_PATH}titulos`, titulo).toPromise();
  }

  atualizar(titulo: ITitulo) {
    return this.httpClient.put<ITitulo>(`${API_PATH}titulos/${titulo.id}`, titulo).toPromise();
  }

  excluir(id: number) {
    return this.httpClient.delete(`${API_PATH}titulos/${id}`).toPromise();
  }
}
