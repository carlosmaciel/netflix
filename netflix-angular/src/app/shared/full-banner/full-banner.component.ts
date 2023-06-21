import { Component } from '@angular/core';
import { TituloService } from '../../service/titulo/titulo.service';
import { ITitulo } from '../../service/titulo/ITitulo';

@Component({
  selector: 'app-full-banner',
  templateUrl: './full-banner.component.html',
  styleUrls: ['./full-banner.component.scss']
})
export class FullBannerComponent {

  constructor(private tituloService: TituloService) {

  }

  /*obterTodos() {
    this.tituloService.obterTodos()
      .then(titulos => console.log(titulos))
      .catch(error => console.log(error));
  }

  obterById() {
    this.tituloService.obterById(9)
      .then(titulo => console.log(titulo))
      .catch(error => console.log(error));
  }

  adicionarTitulo() {
    const titulo: ITitulo = {
      marca: "Fiat", 
      nome: "Argo"
    }

    this.tituloService.adicionar(titulo)
      .then(titulo => console.log(titulo))
      .catch(error => console.log(error));
  }

  atualizarTitulo() {
    const titulo: ITitulo = {
      id: 9,
      marca: "Chevrolet", 
      nome: "Cruze"
    }

    this.tituloService.atualizar(titulo)
      .then(titulo => console.log(titulo))
      .catch(error => console.log(error));
  }

  excluirTitulo() {
    this.tituloService.excluir(4)
      .then(titulo => console.log('Excluído!'))
      .catch(error => console.log(error));
  }*/
}
