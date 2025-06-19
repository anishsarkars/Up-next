import java.util.List;
import java.util.Optional;

public class OpportunityService {
    private final OpportunityRepository repository = new OpportunityRepository();

    public List<Opportunity> getAllOpportunities() {
        return repository.getAll();
    }

    public Opportunity addOpportunity(String title, String description, String type, String date) {
        return repository.add(title, description, type, date);
    }

    public Optional<Opportunity> getOpportunityById(int id) {
        return repository.getById(id);
    }
} 