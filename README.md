# Практическое задание.
## Информационная система учебного заведения.
[Ссылка на задание](https://docs.google.com/document/d/1COj5FSznQYb5yC-z6eeu6ggpT8VijWzjwsvZ0ugukN8)
## Структура системы в виде диаграммы классов:
![alt-диаграмма](https://github.com/dusteer/Manuilov/blob/master/123.png)
## Пример исполняемого файла:
``` 
@startuml
class Main {
+ main():String[] args
}

class Institution {
- students: List<Student>
- lecturers: List<Lecturer>
- courses: List<Course>
+ addSubject(Subject)
+ removeSubject(Subject)
+ addLecturers(Lecturer)
+ removeLecturers(Lecturer)
+ addStudent(Student)
+ removeStudent(Student)
}

class Student{
- id: int
- name: String
- lecturer: List<Lecturer>
+ Student(name: String)
+ getid(): int
+ getName(): String
+ addLecturer(lecturer: Lecturer)
+ getLecturers(): List<Lecturer>
}

class Course{
- name: String
- group: List<Lecturer>
- lecturer: Lecturer
+ changeLecturer(Lecturer)
}

class Lecturer{
- id: int
- name: String
- lecturer: List<Lecturer>
+ Lecturer(name: String)
+ getid(): int
+ getName(): String
}

Institution o--> Student
Institution o--> Course
Institution o--> Lecturer
Institution <-down- Main
Student - Course
Course - Lecturer
@enduml 
```
