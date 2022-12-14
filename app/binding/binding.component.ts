import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  title :string="random word to data Binding";
  nom :string="Naim";
  status:boolean=true;
  constructor() { }

  ngOnInit(): void {
  }
  changeTitle(){
    this.title="a new title"
  }

}
