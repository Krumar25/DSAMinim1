package edu.upc.dsa.models;
import edu.upc.dsa.util.RandomUtils;

public class Game {
    String idgame;
    String description;
    int level;

public Game() {
    this.idgame = RandomUtils.getId();
}

public Game(String idgame, String description, int level) {
    this.idgame = idgame;
    this.description = description;
    this.level = level;
}

public String getId() {
    return this.idgame;
}

 public void setId(String id) {
    this.idgame = id;
 }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

@Override
    public String toString() {
    return "Game [id= "+idgame+" , description= "+description+" , level= "+level+"]";
}


}
