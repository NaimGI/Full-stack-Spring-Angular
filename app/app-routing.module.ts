import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddCityComponent } from './add-city/add-city.component';
import { CityComponent } from './city/city.component';
import { UpdateCityComponent } from './update-city/update-city.component';

const routes: Routes = [
  {path: "city", component : CityComponent},
  {path:"add-city",component:AddCityComponent},
  {path: "updateCity/:id", component: UpdateCityComponent},
  { path: "", redirectTo: "city", pathMatch: "full" }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
