import { Component } from '@angular/core';
import { SpCRUDService } from 'src/app/services/sp-crud.service';

@Component({
  selector: 'app-spring-crud',
  templateUrl: './spring-crud.component.html',
  styleUrls: ['./spring-crud.component.css']
})
export class SpringCRUDComponent {


  constructor(private _spCRUD:SpCRUDService){

  }

  movies= null;
  formHeader="Add Movie";
  Movie;
  id:number;
  location="";
  price:number;
  showForm=false;
  
  
  ngOnInit():void{
    
    this.getMovies();
  }

  getMovies(){
    this._spCRUD.fetchMovies().subscribe(
      (data)=>{
        this.movies=data;
        console.log(data); 
      },
      (error)=>{
      console.log("error")
    })
  }

  deleteMovies(id){
    this._spCRUD.deleteMovies(id).subscribe(
      (res)=>{
        this.getMovies()

      })

  }

  openForm(data=null){
    this.showForm=true;
    if(data){
      this.Movie=data.name;
      this.id=data.id;
      this.location=data.location
      this.price=data.price;
      
    }
  }

  closeForm(){
    this.showForm= false;
    this.clearForm();
  }

  clearForm(){
    this.Movie=null;
      this.id=null;
      this.location=null;
      this.price=null;
  }


  saveMovie(data){
    this._spCRUD.DataPost(data.value).subscribe(
      (res)=>{
        console.log(res)
      },
      (err)=>{
        console.log(err)
      }
    );
    this.getMovies();
  }
}
