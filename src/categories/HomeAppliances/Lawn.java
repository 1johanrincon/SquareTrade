package categories.HomeAppliances;

import categories.Categories;
import categories.Root;
import lombok.Data;

@Data
public class Lawn extends Root implements Categories {
    public Lawn(){
        this.keywords.add("Garden");
        this.keywords.add("Lawn");
        this.keywords.add("GardeningTools");
    }

    @Override
    public void inicialLevel() {
        this.level = 3;
    }
}
