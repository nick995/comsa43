public abstract class Person {
    private String id;
    private String name;
    private String email;

    /**
     * Constructors part
     *
     * @param  String id, String name, String email
     * @return None
     */
    public Person(String id, String name, String email){
        setID(id);
        setName(name);
        setEmail(email);

    }
    // Accessores part
    /**
     *  getId
     *
     * @param  None
     * @return id
     */
    public String getId()     {
        return id;
    }
    /**
     *  getName
     *
     * @param  None
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     *  getEmail
     *
     * @param  None
     * @return email
     */
    public String getEmail() {
        return email;
    }

    //Mutator part

    /**
     * setId
     * @param  String name
     * @return None
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * setEmail
     * @param  String email
     * @return None
     */
    // using Regular expression (regex) to check if it is correct or email format or not.
    public void setEmail(String email) {
        if (!email.matches("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$")
                ) {
            throw new IllegalArgumentException("Email address is not a vaild. Please check again");
        }
        this.email = email;
    }

    public void setID(String id){
        if (!isValidId(id)){
            throw new IllegalArgumentException("ID is not vaild. Please check again");
        }
        this.id = id;
    }

    public abstract boolean isValidId(String id);

    public String toString() {
        String report = "";
        report += "User's Id is    = " + id + "\n";
        report += "User's Name is  = " + name + "\n";
        report += "User's Email is = " + email + "\n";
        return report ;
    }

}
