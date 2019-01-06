import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from "@angular/core";
import { Observable } from  "rxjs" ;

export interface FoodType { 
  idtype: number;
  nametype: string;
}

export interface CookingMethod {
  value: number;
  viewValue: string;
}

export interface MainIngredients {
  value: number;
  viewValue: string;
}


@Injectable()
@Component({
  selector: 'app-makefood-add',
  templateUrl: './makefood-add.component.html',
  styleUrls: ['./makefood-add.component.css']
})


export class MakefoodAddComponent implements OnInit {
 
  foodtypes : FoodType[] = [];
  cookingmethods:CookingMethod[] =[];
  mainingreds:MainIngredients[] = [];

  private foodtypeid :number;
  private  cookingmethodid:number;
  private  mainingredid:number;
  private urlphoto : string;

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {

    this.httpClient.get("http://localhost:8080/FoodType").subscribe(
      body => {
        console.log("GET Request is successful ", body);
        for (let index = 0; index < body["length"]; index++) {
          this.foodtypes.push({
            idtype: body[index].id,
            nametype: body[index].name
          })
        }
      },error => {console.log("Error", error);}
    );

    this.httpClient.get("http://localhost:8080/CookingMethod").subscribe(
      body => {
        console.log("GET Request is successful ", body);
        for (let index = 0; index < body["length"]; index++) {
          this.cookingmethods.push({
            value: body[index].id,
            viewValue: body[index].name
          })
        }
      },error => {console.log("Error", error);}
    );

    this.httpClient.get("http://localhost:8080/MainIngraed").subscribe(
      body => {
        console.log("GET Request is successful ", body);
        for (let index = 0; index < body["length"]; index++) {
          this.mainingreds.push({
            value: body[index].id,
            viewValue: body[index].name
          })
        }
      },error => {console.log("Error", error);}
    );

    










  }

}
