
package com.example.virosample;

import android.app.Application;

import com.example.virosample.model.ProductManagerDB;


public class ProductApplicationContext extends Application {
    private ProductManagerDB mProductDB;

    public ProductManagerDB getProductDB(){
        if (mProductDB == null){
            mProductDB = new ProductManagerDB();
        }

        return mProductDB;
    }
}
