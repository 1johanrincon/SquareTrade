package categories.HomeAppliances;

import categories.Categories;

public class GeneralAppliances extends MajorAppliances implements Categories {

    public GeneralAppliances(){
        this.keywords.add("General Appliances");
    }

    @Override
    public void inicialLevel() {
        this.level = 4;
    }
}
