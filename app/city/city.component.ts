import { Component, OnInit } from '@angular/core';
import { CityService } from '../city.service';
import { City } from '../model/city.model';

@Component({
  selector: 'app-city',
  templateUrl: './city.component.html',
  styleUrls: ['./city.component.css']
})
export class CityComponent implements OnInit {
  citys? : City[]; //un tableau de Produit
 

  constructor(private cityService :CityService) { 
  }

  ngOnInit(): void {
    this.citys = this.cityService.listeCitys();
  }
  DeleteCity(p: City)
{
//console.log(p);
let conf = confirm("Etes-vous sûr ?");
if (conf)
this.cityService.DeleteCity(p);
}

}
