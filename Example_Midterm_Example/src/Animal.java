public abstract class Animal{
    private String name = "";
    private int power = 0;
    private int age = 0;
    
    public Animal(){
        this("", 0, 0);
    }
    
    public Animal(String name, int power, int age){
        this.name = name;
        this.power = power;
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPower(int power){
        this.power = power;
    }
    
    public int getPower(){
        return power;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public boolean equals(Animal a){
        return (this.name.equals(a.getName())) && (this.age == getAge());
    }
    
    @Override
    public String toString(){
        return "Animal : name = " + name + ", power = " + power + ", age = " + age;
    }
    
    public abstract void eat(Food a);
    
}
