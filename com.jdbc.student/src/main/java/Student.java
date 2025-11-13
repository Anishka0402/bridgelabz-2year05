package Student.com.jdbc.student;

import java.sql.Date;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private Date enrolled_date;

    public Student(int id, String name, int age, String email, Date enrolled_date){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.enrolled_date = enrolled_date;
    }

    public int getId() { 
        return id; 
    }

    public String getName() { 
        return name; 
    }

    public int getAge() { 
        return age; 
    }

    public String getEmail() { 
        return email; 
    }

    public Date getEnrolled_date() { 
        return enrolled_date; 
    }
}
