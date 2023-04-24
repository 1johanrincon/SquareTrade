package categories.HomeAppliances;

import categories.Categories;
import lombok.Data;

@Data
public class Garden extends HomeAppliances implements Categories {
    public Garden(){
        this.keywords.add("Garden");
        this.keywords.add("Lawn");
        this.keywords.add("GardeningTools");
    }

    @Override
    public void inicialLevel() {
        this.level = 3;
    }
}
