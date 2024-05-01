import java.util.ArrayList;
public class Restaurant {
    private String name;
    private String address;
    private ArrayList<Menu> menus;

    public Restaurant(String name, String address){
        this.name = name;
        this.address = address;
        this.menus = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String makeString(){
        //single string representation
        return name +""+ address;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void addMenu(Menu menu){
        this.menus.add(menu);
    }
}
