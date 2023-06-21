import { Component, Input, OnInit } from '@angular/core';
import { ITitulo } from 'src/app/service/titulo/ITitulo';

@Component({
  selector: 'app-list-titles',
  templateUrl: './list-titles.component.html',
  styleUrls: ['./list-titles.component.scss']
})
export class ListTitlesComponent implements OnInit {
  
  @Input() name!: string;
  @Input() list: any;
  @Input() listTitulos: ITitulo[] = [];

  constructor() { }

  ngOnInit() { }

}
