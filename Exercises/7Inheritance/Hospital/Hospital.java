class data{
    String name,Speciality;
    int Age,WorkExp;
}

class Doctor extends data{

    String Doc_name,Doc_Speciality;
    int Doc_Age,Doc_WorkExp;

    public Doctor (){
       
        Doc_name = "Kafka";
        Doc_Age = 28;
        Doc_Speciality ="Curing my heart with love ;)";
        Doc_WorkExp = 5;
        
    } 
    
}

class Nurse extends data{

    String Nurse_name,Nurse_Speciality;
    int Nurse_Age,Nurse_WorkExp;

    Nurse (){
        
        Nurse_name = "Rina";
        Nurse_Age = 28;
        Nurse_Speciality ="Curing my heart with love ;)";
        Nurse_WorkExp = 5;
        
    }


}
//encapsulated
class Receptionist extends data{

    private String Rcpt_name,Rcpt_Speciality;
    private int Rcpt_Age,Rcpt_WorkExp;
    
    Receptionist (String Rcpt_name,String Rcpt_Speciality, int Rcpt_Age, int Rcpt_WorkExp){

        this.Rcpt_name = Rcpt_name;
        this.Rcpt_Age = Rcpt_Age;
        this.Rcpt_Speciality = Rcpt_Speciality;
        this.Rcpt_WorkExp = Rcpt_WorkExp;
    }


    void setRcpt_WorkExp(int Rcpt_WorkExp){
        this.Rcpt_WorkExp= Rcpt_WorkExp;
    }

    int getRcpt_WorkExp(){
        return Rcpt_WorkExp;
    }

    void setRcpt_Speciality(String Rcpt_Speciality){
        this.Rcpt_Speciality= Rcpt_Speciality;
    }

    String getRcpt_Speciality(){
        return Rcpt_Speciality;
    }

    void setRcpt_Age(int Rcpt_Age){
        this.Rcpt_Age = Rcpt_Age;
    }
    int getRcpt_Age(){
        return Rcpt_Age;
    }

    void setRcpt_name(String Rcpt_name){
        this.Rcpt_name=Rcpt_name;
    }
    String getRcpt_name(){
        return Rcpt_name;
    }

    public String toString(){
        String str = "Receptionist Name :" + getRcpt_name()+'\n'+ "Speciality : "+ getRcpt_Speciality() + '\n' + "Age : " +getRcpt_Age()+'\n' +"Work Experience (in years) : "+getRcpt_WorkExp() + '\n';
        return str;
    }

}
//encapsulated 
class Cleaner extends data{

    private String Cl_Department,Cl_name;

    Cleaner (String Cl_Department,String Cl_name){
        this.Cl_name = Cl_name;
        this.Cl_Department = Cl_Department;
    }

    void setCleaner(String Cl_name,String Cl_Department){
        this.Cl_name=Cl_name;
        this.Cl_Department=Cl_Department;
    }
    String getName(){
        return Cl_name;
    }
    String getDepartment(){
        return Cl_Department;
    }

    public String toString(){
        String str= "Cleaner Name : " + getName()  + "\n" + "Assigned Department : "+ getDepartment()  + "\n";
        return str;
    }
    
}

public class Hospital {

    public static void main(String[] args) {
        Cleaner clnr =new Cleaner("Emergency Department","Sum dud");
        Doctor Dr = new Doctor();
        Nurse Ne = new Nurse();
        Receptionist Rt = new Receptionist("Achreon","Curing my heart with love ;)",26,600);

        System.out.println(clnr.toString()+'\n'+ Rt.toString());
        System.out.println("Doctor's Name : " + Dr.Doc_name  + "\n" + "Speciality : "+ Dr.Doc_Speciality  + "\n" + "Age : "+ Dr.Doc_Age+'\n'+ "Experience (Years) : "+ Dr.Doc_WorkExp+"\n");
        System.out.println("Nurse's Name : " + Ne.Nurse_name  + "\n" + "Speciality : "+ Ne.Nurse_Speciality  + "\n" + "Age : "+ Ne.Nurse_Age+'\n'+ "Experience (Years) : "+ Ne.Nurse_WorkExp+"\n");
        
    }
}
