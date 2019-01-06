import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import  { AddMakefoodComponent } from './add-makefood/add-makefood.component';
import{ListMakefoodComponent} from './list-makefood/list-makefood.component';


const routes: Routes = [




    
];


@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }