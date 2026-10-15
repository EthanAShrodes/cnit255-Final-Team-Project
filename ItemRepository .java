package foodmenu.model;
import java.util.List;
public interface FoodMenuRepository {

    List<FoodMenu> findAll();
    FoodMenu findById(int id);
    FoodMenu save(FoodMenu item); // insert if id == 0, else update
    void deleteById(int id);

}