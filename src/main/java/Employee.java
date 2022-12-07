public class Employee {
    private String name, employmentType, gender, PPS;
    private int age;

    public Employee(String name, String employmentType, String gender, String PPS, int age){
        setAge(age);
        setName(name);
        setEmploymentType(employmentType);
        setGender(gender);
        setPPS(PPS);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3 && name.length() <= 25) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid name error");
        }
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        if(employmentType.equals("Full-time") || employmentType.equals("Part-time") || employmentType.equals("Contract")) {
            this.employmentType = employmentType;
        }
        else{
            throw new IllegalArgumentException("Invalid employment type error");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.equals("Man") || gender.equals("Woman") || gender.equals("Non-Binary")) {
            this.gender = gender;
        }
        else{
            throw new IllegalArgumentException("Invalid gender type error");
        }
    }

    public String getPPS() {
        return PPS;
    }

    public void setPPS(String PPS) {
        if(PPS.length() == 11) {
            this.PPS = PPS;
        }
        else{
            throw new IllegalArgumentException("Invalid PPS number error");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 16 && age < 66) {
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Invalid age error");
        }
    }



}

