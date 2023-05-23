public class Animal {
    private String Name;
    private String Species;

    public Animal(String Name, String Species){
        this.Name = Name;
        this.Species = Species;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }
}
