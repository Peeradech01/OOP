public class Player {
    private String name;
    private String team;
    
    public void setName(String n){
        this.name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setTeam(String t){
        this.team = t;
    }
    
    public String getTeam(){
        return team;
    }
    
    public boolean isSameTeam(Player p){
        if ((p.getTeam().equals(this.getTeam()))){
            return true;
        }
        else{
            return false;
        }
    }
}
