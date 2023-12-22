package ru.netology;

import org.codehaus.jackson.annotate.JsonProperty;

public class CatsFacts {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvotes;


    public CatsFacts(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }



    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {

        System.out.println();
        System.out.println();
        return  "id : " + getId() +"\ntext : " + getText() +"\ntype : " + getType()
                + "\nuser : " + getUser()  + "\nupvotes : " + getUpvotes();
    }
}
