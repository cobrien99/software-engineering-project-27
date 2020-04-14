
package com.example.virosample.model;

import com.example.virosample.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class ProductManagerDB {
    // A list of all known categories
    private ArrayList<Category> mCatList = new ArrayList<Category>();

    // A Map of Categories to product lists.
    private HashMap<String, ArrayList<Product>> mProducts = new HashMap<String, ArrayList<Product>>();


    // A static set of all known scenarios to be displayed in the application.
    private Product[] defaultProductList = new Product[]{
            new Product("Fire", R.drawable.fire,"file:///android_asset/PUSHILIN_campfire.mtl"),

    };

    public ProductManagerDB(){
        // Create a scenarios to be selected
        createCateogryForProduct("Situations", R.drawable.fire, createRandomizedProductList());

    }

    private void createCateogryForProduct(String catName, int icon, ArrayList<Product> list){
        mCatList.add(new Category(catName, icon));
        mProducts.put(catName, list);
    }

    private ArrayList<Product> createRandomizedProductList(){
        Random r = new Random();
        ArrayList<Integer> addedList = new ArrayList<Integer>();
        ArrayList<Product> productList = new ArrayList<Product>();
        for (int i = 0; i < defaultProductList.length; i ++){
            int randProduct = r.nextInt(defaultProductList.length);

            while(addedList.contains(randProduct)){
                randProduct = r.nextInt(defaultProductList.length);
            }

            addedList.add(randProduct);
            productList.add(defaultProductList[randProduct]);
        }
        return productList;
    }

    public ArrayList<Category> getCatlist(){
        return mCatList;
    }

    public ArrayList<Product> getProductList(Category cat){
        return mProducts.get(cat.mName);
    }

    public Product getProductByName(String name){
        for (ArrayList<Product> list : mProducts.values()){
            for (Product product : list){
                if (product.mName.equalsIgnoreCase(name)){
                    return product;
                }
            }
        }
        return null;
    }
}
