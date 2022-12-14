import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BindingComponent } from './binding/binding.component';
import { FormsModule } from '@angular/forms';
import { CityComponent } from './city/city.component';
import { AddCityComponent } from './add-city/add-city.component';
import { UpdateCityComponent } from './update-city/update-city.component';

@NgModule({
  declarations: [
    AppComponent,
    BindingComponent,
    CityComponent,
    AddCityComponent,
    UpdateCityComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
