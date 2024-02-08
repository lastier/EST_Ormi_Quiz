package WeeklyQuiz240208;

public class PersonalContact extends Contact{
    private String relationship;

    public PersonalContact(){

    }
    public String getRelationship(){
        return relationship;
    }

    public void setRelationship(String relationship){
        this.relationship=relationship;
    }

    public String toString(){
        return "Contacts "+"Name : "+getName()+" PhoneNumber : "+getPhoneNumber()+" Relationship : "+relationship;
    }
}
