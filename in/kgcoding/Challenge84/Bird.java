package in.kgcoding.Challenge84;

public abstract class Bird implements Flyable{

    private final String breed;

    public String getBreed() {
        return breed;
    }

    public Bird(String breed) {
        this.breed = breed;
    }

    

}
