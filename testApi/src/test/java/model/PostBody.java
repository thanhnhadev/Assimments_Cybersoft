package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostBody {

    private int userId;
    private int id;
    private String title;
    private String body;

    public PostBody(int userId, int id, String title, String body){
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public PostBody(){

    }
}
