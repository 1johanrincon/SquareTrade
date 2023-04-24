package categories;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class Root implements Categories{
    public int level;
    public Set<String> keywords = new HashSet<>();

    public Root(){
        this.keywords.add("Root");
        this.keywords.add("other insurance categorie");
        inicialLevel();
    }

    public Root(String categories) {
        this.keywords.add(categories);
    }

    @Override
    public void addCategorie(String categorie) {
        keywords.add(categorie);
    }

    @Override
    public String searchEngine(String categorie) {
        return this.keywords.stream().filter(keyword -> keyword.contains(categorie)).collect(Collectors.toList()).toString();
    }

    @Override
    public void inicialLevel() {
        this.level = 1;
    }
}
