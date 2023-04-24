package categories.HomeAppliances;

import categories.Categories;
import lombok.Data;

@Data
public class KitchenAppliances extends MajorAppliances implements Categories {

    public KitchenAppliances(){
        this.keywords.add("Kitchen Appliances");
    }

    @Override
    public void inicialLevel() {
        this.level = 4;
    }
}
