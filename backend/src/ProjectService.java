import java.util.List;
import java.util.Optional;

public class ProjectService {
    private final ProjectRepository repository = new ProjectRepository();

    public List<Project> getAllProjects() {
        return repository.getAll();
    }

    public Project addProject(String title, String description, String owner, List<String> tags) {
        return repository.add(title, description, owner, tags);
    }

    public Optional<Project> getProjectById(int id) {
        return repository.getById(id);
    }
} 