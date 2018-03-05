public class Person {
    private String Id;
    private String Name;
    private String Email;


    public Person(String Id, String Name){

        if(Id.length() != 9)

        this.Id = Id;
        this.Name = Name;
    }

    public  Person(String Id, String Name, String Email){

        this.Id = Id;
        this.Name = Name;
        this.Email = Email;


    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    private Boolean isVaildId(String Id){


    }

}
