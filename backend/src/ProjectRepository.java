import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectRepository {
    private final List<Project> projects = new ArrayList<>();
    private int nextId = 1;

    public List<Project> getAll() {
        return new ArrayList<>(projects);
    }

    public Project add(String title, String description, String owner, List<String> tags) {
        Project proj = new Project(nextId++, title, description, owner, tags);
        projects.add(proj);
        return proj;
    }

    public Optional<Project> getById(int id) {
        return projects.stream().filter(p -> p.getId() == id).findFirst();
    }
} 