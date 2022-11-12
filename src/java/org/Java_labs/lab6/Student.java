package org.Java_labs.lab6;

public class Student {
    String lastname, name, surname, dateOfBirth, address, faculty;
    int phoneNumber, course, group;
    Student(){
        lastname = "lastname";
		name = "name";
		surname = "surname";
        dateOfBirth = "00.00.0000";
        address = "address";
        faculty = "faculty";
        phoneNumber = "000-000-00-00";
        course = 0;
		group = 0;
    }
    Student(String[] arr){
		lastname = arr[0];
        name = arr[1];
        surname = arr[2];
        dateOfBirth = arr[3];
        address = arr[4];
        faculty = arr[5]; 
        phoneNumber = arr[6];
        course = Integer.parseInt(arr[7]);
		group = Integer.parseInt(arr[8]);
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
	public void setName(String name){
        this.name = name;
    }
	public void setSurname(String surname){
        this.surname = surname;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setAddress(String address){
        this.address = address;
    }
	public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setCourse(int course){
        this.course = course;
    }
	public void setGroup(int group){
        this.group = group;
    }
	public String getLastname(){
        return lastname;
    }
	public String getName(){
        return name;
    }
	public String getSurname(){
        return surname;
    }
	public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String getAddress(){
        return address;
    }
	public String getFaculty(){
        return faculty;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public int getCourse(){
        return course;
    }
	public int getGroup(){
        return group;
    }
    @Override
    public String toString(){
        String data = "\n Student: ";
        data += lastname + " " + name + " " + surname;
        data += "\n Date of birth: " + dateOfBirth;
        data += "\n Address: " + address;
		data += "\n Faculty: " + faculty;
        data += "\n Phone number: " + phoneNumber;
        data += "\n Course: " + Integer.toString(course);
		data += "\n Group: " + Integer.toString(group);
        return data;
    }
}
