import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MakefoodAddComponent } from './makefood-add/makefood-add.component';
import { MakefoodListComponent } from './makefood-list/makefood-list.component';

const routes: Routes = [
  { path: '',             component : MakefoodListComponent },
  { path: 'makefood-list',component : MakefoodListComponent },
  { path: 'makefood-add', component : MakefoodAddComponent}



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
