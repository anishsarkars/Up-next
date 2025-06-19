import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OpportunityRepository {
    private final List<Opportunity> opportunities = new ArrayList<>();
    private int nextId = 1;

    public List<Opportunity> getAll() {
        return new ArrayList<>(opportunities);
    }

    public Opportunity add(String title, String description, String type, String date) {
        Opportunity opp = new Opportunity(nextId++, title, description, type, date);
        opportunities.add(opp);
        return opp;
    }

    public Optional<Opportunity> getById(int id) {
        return opportunities.stream().filter(o -> o.getId() == id).findFirst();
    }
} 