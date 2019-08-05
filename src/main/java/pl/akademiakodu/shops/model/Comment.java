package pl.akademiakodu.shops.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Comment {

    //-destripction
    // -tani, drogi
    //-cena przykładowa koszyka

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    private boolean cheap;

    private Double price;


    /*
     oneToOne sprawia że będzie tworzony klucz obcy
     o nazwie shop_id, który będzie odnsił sie do tabeli shop
     */

    @OneToOne
    private Shop shop;


    /*
    co to nam daje:
    1) private int shop_id;
    2)w sposób automagiczny


     */

    @Override
    public  String toString(){
        return  getDescription()+"   "+",shopping cost :"+price+" zł";

        }





}


