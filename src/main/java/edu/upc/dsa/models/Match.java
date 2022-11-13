package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Match {
    String idmatch;
    String iduser;
    int points = 50;
    int level;

public Match() {
    this.idmatch = RandomUtils.getId();
}

public Match (String idmatch, String iduser, int points) {
    this.idmatch = idmatch;
    this.iduser = iduser;
    this.points = points;
}

    public String getIdMatch() {
    return this.idmatch;
}

    public void setIdMatch(String id)
    {this.idmatch = id;
    }

    public String getIdUser() {
    return  this.iduser;
    }

    public void setIdUser(String id) {
    this.iduser = id;
}

    public Integer getPoints() {
    return this.points;
}

    public void setPoints(int points) {
    this.points = points;
}

    public Integer getLevel() {
    return this.level;}

    public void setLevel() {
    this.level = level;
}


}
