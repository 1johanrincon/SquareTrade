package categories.Furniture;

import categories.Categories;
import categories.HomeAppliances.HomeAppliances;
import categories.Root;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Furniture extends Root implements Categories {
    public Furniture(){
        this.keywords.add("Furniture");
    }

    @Override
    public void inicialLevel() {
        this.level = 2;
    }
}
