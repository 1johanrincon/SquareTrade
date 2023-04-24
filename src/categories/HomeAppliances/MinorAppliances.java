package categories.HomeAppliances;

import categories.Categories;
import lombok.Data;

@Data
public class MinorAppliances extends HomeAppliances implements Categories {
    public MinorAppliances(){
        this.keywords.add("Minor Appliances");
    }

    @Override
    public void inicialLevel() {
        this.level = 3;
    }
}
