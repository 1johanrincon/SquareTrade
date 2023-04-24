package categories.Electronics;

import categories.Categories;
import categories.Root;
import lombok.Data;

@Data
public class Electronics extends Root implements Categories {

    public Electronics(){
        this.keywords.add("Electronics");
    }

    @Override
    public void inicialLevel() {
        this.level = 2;
    }
}
