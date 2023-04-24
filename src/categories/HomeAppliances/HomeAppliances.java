package categories.HomeAppliances;

import categories.Categories;
import categories.Root;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class HomeAppliances extends Root implements Categories {

    public HomeAppliances(){
        this.keywords.add("HomeAppliances");
    }

    @Override
    public void inicialLevel() {
        this.level = 2;
    }
}
