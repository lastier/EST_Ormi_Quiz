package WeeklyQuiz240208;

public class BusinessContact extends Contact{
    private String company;
    public BusinessContact(){

    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String toString(){
        return "Contacts "+"Name : "+getName()+" PhoneNumber : "+getPhoneNumber()+" Company : "+company;
    }
}
