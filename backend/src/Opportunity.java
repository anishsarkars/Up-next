public class Opportunity {
    private int id;
    private String title;
    private String description;
    private String type; // e.g., Scholarship, Event, Competition, Internship
    private String date;

    public Opportunity(int id, String title, String description, String type, String date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.type = type;
        this.date = date;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
} 