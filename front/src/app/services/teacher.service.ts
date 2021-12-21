import {Injectable} from '@angular/core';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Teacher} from '../models/teacher';

@Injectable({
  providedIn: 'root'
})
export class TeacherService {
  baseUrl = "localhost:8762/base/teachers"
  constructor(public http: HttpClient) {
  }
  public findAllUsers(): Observable<Teacher[]>{
    return this.http.get<Teacher[]>(this.baseUrl);
  }

}
