import { Component, OnInit } from '@angular/core';
import { CityService } from '../city.service';
import { City } from '../model/city.model';


@Component({
  selector: 'app-add-city',
  templateUrl: './add-city.component.html',
})
export class AddCityComponent implements OnInit {
  newCity = new City();
  message?:string;
  constructor(private cityService: CityService) { }

  ngOnInit(): void {
  }
  addCity(){
    this.cityService.addCity(this.newCity);
    this.message="The ciy "+this.newCity.nomCity+" is added succefully";
  }
    

}
