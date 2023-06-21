import { Component, Output } from '@angular/core';
import { SecaoService } from './service/secao/secao.service';
import { ISecao } from './service/secao/ISecao';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  menuOpened = false;
  listSecoes: ISecao[] = [];

  constructor(private secaoService: SecaoService) {

  }

  ngOnInit(): void {
    this.obterSecoes();
  }

  setMenuState(state : boolean) {
    this.menuOpened = state;
  }

  toggleBackdrop() {
    this.menuOpened = !this.menuOpened;
  }

  obterSecoes() {
    this.secaoService.obterTodos()
      .then(secoes => this.listSecoes = secoes as ISecao[])
      .then(secoes => console.log(secoes))
      .catch(error => console.log(error));
  }

  setListTitulos(secoes : ISecao[]) {
    this.listSecoes
  }

}