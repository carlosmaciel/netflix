import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-title',
  templateUrl: './title.component.html',
  styleUrls: ['./title.component.scss']
})
export class TitleComponent implements OnInit {

  @Input() titulo!: any;
  muted: boolean = true;

  constructor() {}

  ngOnInit(): void {
  }

  getMuted() {
    return this.muted;
  }

  toggleSound() {
    this.muted = !this.muted;
  }
}
