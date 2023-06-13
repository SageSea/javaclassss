package hasA;

public class OS {
    private String Name;
    private String version;
    public OS(String Name,String version){
        this.Name = Name;
        this.version = version;
    }
    public String getName(){
        return Name;
    }
    public String getVersion(){
        return version;
    }
}
