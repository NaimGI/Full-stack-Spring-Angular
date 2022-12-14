import { Injectable } from '@angular/core';
import { City } from './model/city.model';

@Injectable({
  providedIn: 'root'
})
export class CityService {
  citys : City[]; //un tableau de City
  city? :City;
  constructor() {
    this.citys = [{idCity : 1, nomCity : "Nabeul", space : 3000.600, DateCreation : new Date("01/14/2011")},
    {idCity : 2, nomCity : "Binzert", space : 450, DateCreation : new Date("12/17/2010")},
    {idCity : 3, nomCity :"Kaf", space : 900.123, DateCreation : new Date("02/20/2020")}
    ];
   }
   listeCitys():City[] 
   {return this.citys;
   }
   addCity( c: City){
   this.citys.push(c);
   }
  DeleteCity(p: City)
    {
      const index = this.citys.indexOf(p, 0);
      if (index > -1) {
      this.citys.splice(index, 1);
      }
      
    }
    consulterCity(id:number): City{
      this.city = this.citys.find(p => p.idCity == id)!;
      return this.city;
      }
      trierCity(){
        this.citys = this.citys.sort((n1,n2) => {
        if (n1.idCity! > n2.idCity!) {
        return 1;
        }
        if (n1.idCity! < n2.idCity!) {
        return -1;
        }
        return 0;
        });
        }
        
      updateCity(p:City)
{
       // console.log(p);
      this.DeleteCity(p);
        this.addCity(p);
        this.trierCity()
}
}
