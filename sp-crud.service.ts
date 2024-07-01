import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SpCRUDService {

  private _url="http://localhost:8080/";

  constructor(private _http:HttpClient) {

   }

   fetchMovies(){
    return this._http.get(this._url)
   }

   deleteMovies(id){
    return this._http.delete(this._url+id)
   }

   DataPost(data){
    return this._http.post(this._url,data)
   }
}
