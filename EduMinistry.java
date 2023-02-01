package university; 
import java.util.ArrayList; 
import org.springframework.stereotype.Component; 

@Component 
public class EduMinistry {
public int id; 
String name; 
Student beststudent; 
ArrayList<Student> listOfStudents=new ArrayList<Student>();

public Student getBeststudent(){
     return beststudent; 
}


public void setBeststudent (Student beststudent) {
 this.beststudent = beststudent; 

}

public EduMinistry(String name) {
this.name = name; 

}
 
public int getId() {
     return id; 
}
 
public void setId (int id) {
this.id = id; 

}


public String getName() {
     return name; 
}

public void setName (String name) {
    this.name = name;
}

public ArrayList<Student> getListOfStudents() {
    return listOfStudents;
}

public void setListOfStudents (ArrayList<Student> listOfStudents) {
    this.listOfStudents = listOfStudents;
}

}
