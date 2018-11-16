package com.iesemilidarder.asoto.resolution.core;

import com.iesemilidarder.asoto.resolution.core.data.Activity;
import com.iesemilidarder.asoto.resolution.core.data.Event;
import com.iesemilidarder.asoto.resolution.core.data.Product;
import com.iesemilidarder.asoto.resolution.core.data.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * com.iesemilidarder.asoto.resolution.core
 * Class DataHelper
 * By berto. 14/11/2018
 */
public class DataHelper {
    public static Integer MAX_NUM = 50;
    private static List<Product> products = new ArrayList<>();

    public static List<Product> getItems() {
        if (products.isEmpty()) {
            doInit();
        }
        return products;
    }

    public static Product getItemById(UUID id) {
        try {
            for (Product aux : products) {
                if(aux.getId().equals(id)){
                    return aux;
                }
            }
        }catch (Exception e){
            System.out.println("MEK!!!" + e.toString());
        }
        return null;
    }

    public static void addItem(Product aux) {
        try{
            if (aux!=null){
                Product alpha = getItemById(aux.getId());
                if (alpha==null){
                    products.add(alpha);
                }
            }
        }catch (Exception e){
            System.out.println("MEK!!!" + e.toString());
        }
    }

    private static void doInit() {
        //TODO ASF (14/11/2018) Hacer lazy init
        for (int i = 0; i < MAX_NUM; i++) {
            final int resto = i % 3;
            /*if(resto == 0){
            }else if(resto==1){
            }else{
            }*/
            Product alpha;
            switch (resto) {
                case 0:
                    alpha = new Event();
                    break;
                case 1:
                    alpha = new Activity();
                    break;
                default:
                    alpha = new Restaurant();
                    break;
            }
            alpha.setName("Product " + resto);
            products.add(alpha);

        }
    }
}
