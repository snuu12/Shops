package pl.akademiakodu.shops.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    // w Bazie dannych mamy kolumne name
    private String name;
    //w bazie dannych mamy kolumne addres
    private  String address;

    // To pole nie jest tworzone jako kolumna w bazie dannych
    @Transient
    private  String description;

    @OneToMany(mappedBy = "shop")
    private List<Comment>comments=new ArrayList<>();

    @Override
    public String toString() {
        return "name: " + name+ ",  "  + "   address: " + address ;
    }
}
