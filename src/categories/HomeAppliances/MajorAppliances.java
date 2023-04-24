package categories.HomeAppliances;

import categories.Categories;
import lombok.Data;

@Data
public class MajorAppliances extends HomeAppliances implements Categories {

    public MajorAppliances(){
        this.keywords.add("MajorAppliances");
    }

    @Override
    public void inicialLevel() {
        this.level = 3;
    }
}
