import { Component, OnInit } from '@angular/core';
import {Teacher} from "../../../../models/teacher";
import {TeacherService} from "../../../../services/teacher.service";
import {AuthService} from "../../../../services/auth.service";
import {UserService} from "../../../../services/user.service";
import {User} from "../../../../models/user";

@Component({
  selector: 'app-find-all-teachers',
  templateUrl: './find-all-teachers.component.html',
  styleUrls: ['./find-all-teachers.component.css']
})
export class FindAllTeachersComponent implements OnInit {
  user: User;
  teachers: Teacher[];
  constructor(private teacherService: TeacherService, private authService: AuthService, private userService: UserService) { }

  ngOnInit() {
    this.getAllTeachers();
  }
  getAllTeachers(){
    if (this.authService.checkAvailability()){
      this.userService.currentUser().subscribe(perf => {
        this.user = perf;
        this.teacherService.findAllUsers().subscribe(perf => {
          this.teachers = perf;
        })
      })
    }
  }


}
