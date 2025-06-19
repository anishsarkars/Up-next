import java.util.List;

public class Project {
    private int id;
    private String title;
    private String description;
    private String owner;
    private List<String> tags;

    public Project(int id, String title, String description, String owner, List<String> tags) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.owner = owner;
        this.tags = tags;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }
} 