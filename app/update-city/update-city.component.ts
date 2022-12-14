import { Component, OnInit } from '@angular/core';
import { ActivatedRoute,Router } from '@angular/router';
import { CityService } from '../city.service';
import { City } from '../model/city.model';

@Component({
  selector: 'app-update-city',
  templateUrl: './update-city.component.html',
  styles: [
  ]
})
export class UpdateCityComponent implements OnInit {
  currentCity = new City();

  constructor(private activatedRoute: ActivatedRoute,
    private cityService: CityService,private router :Router,) { }

  ngOnInit(): void {
    this.currentCity = this.cityService.consulterCity(this.activatedRoute.snapshot. params['id']);
    console.log(this.currentCity);
  }
  updateCity()
  { //console.log(this.currentProduit);
  this.cityService.updateCity(this.currentCity);
  this.router.navigate(['city']);
  }
  
    

}
