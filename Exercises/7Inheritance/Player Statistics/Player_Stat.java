import java.util.Random;

class P_Stats{
    private String name,team;
    int age,total_match_played;

    P_Stats(String name,String team, int age, int total_match_played){
        this.name=name;
        this.team=team;
        this.age=age;
        this.total_match_played=total_match_played;
    }

    String getname(){
        return name;
    }
    void setname(String name){
        this.name=name;
    }

    String getteam(){
        return team;
    }
    void setteam(String team){
        this.team=team;
    }
}

class S_stat{
    Random rand = new Random();
    P_Stats stats =new P_Stats("Sum Dud", "team", rand.nextInt(20,40), rand.nextInt(5,100));
    

    String Football(){
        String ftb_stat ;
        int ftb_pos =rand.nextInt(0,3) ;
        
        if (ftb_pos==0){

            ftb_stat='\n'+"Sport Category : Football"+'\n'+ "Player Name : "+stats.getname()+'\n'+"Age : "+ stats.age+'\n' +"Team Name : "+ stats.getteam()+'\n'+"Position : Striker" +'\n'+"Total Match Played : "+ stats.total_match_played+'\n'+ "Total Goals Scored : " + rand.nextInt(10,100)+'\n';
        }
        else if (ftb_pos ==1){
            ftb_stat='\n'+"Sport Category : Football"+'\n'+ "Player Name : "+stats.getname()+'\n'+"Age : "+ stats.age+'\n' +"Team Name : "+ stats.getteam()+'\n'+"Position : Defender" +'\n'+"Total Match Played : "+ stats.total_match_played+'\n'+ "Total Goals Scored : " + rand.nextInt(10,100)+'\n';
        }
        else if  (ftb_pos==2){
            ftb_stat='\n'+"Sport Category : Football"+'\n'+ "Player Name : "+stats.getname()+'\n'+"Age : "+ stats.age+'\n' +"Team Name : "+ stats.getteam()+'\n'+"Position : GoalKeeper" +'\n'+"Total Match Played : "+ stats.total_match_played+'\n'+ "Total Goals Saved : " + rand.nextInt(10,100)+'\n';
        }
        else{
            ftb_stat= "uh... sum wrong here..";
        }
        
        return ftb_stat;
    }

    String Cricket(){
        String crt_stat;
        int crt_pos =rand.nextInt(0,3) ;

        if (crt_pos==0){
        crt_stat='\n'+"Sport Category : Cricket"+'\n'+ "Player Name : "+stats.getname()+'\n'+"Age : "+ stats.age+'\n' +"Team Name : "+ stats.getteam()+'\n'+"Position : Batter" +'\n'+"Total Match Played : "+ stats.total_match_played+'\n'+ "Total Balls Smashed : " + rand.nextInt(10,100)+'\n';
        }
        else if (crt_pos==1){
        crt_stat='\n'+"Sport Category : Cricket"+'\n'+ "Player Name : "+stats.getname()+'\n'+"Age : "+ stats.age+'\n' +"Team Name : "+ stats.getteam()+'\n'+"Position : Baller" +'\n'+"Total Match Played : "+ stats.total_match_played+'\n'+ "Total Balls Yeeted : " + rand.nextInt(10,100)+'\n';
        }
        else if(crt_pos==2){
        crt_stat='\n'+"Sport Category : Cricket"+'\n'+ "Player Name : "+stats.getname()+'\n'+"Age : "+ stats.age+'\n' +"Team Name : "+ stats.getteam()+'\n'+"Position : Catcher" +'\n'+"Total Match Played : "+ stats.total_match_played+'\n'+ "Total Balls Grabbed : " + rand.nextInt(10,100)+'\n';
        }
        else{
            crt_stat= "uh... sum wrong here..";
        }
        return crt_stat;
    }
}

public class Player_Stat {
    public static void main(String[]args){
        S_stat Sub_Stat = new S_stat();

        System.out.print(Sub_Stat.Football());
        System.out.print(Sub_Stat.Cricket());

    }
}
