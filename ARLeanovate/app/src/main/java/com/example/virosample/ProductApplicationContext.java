
package com.example.virosample;

import android.app.Application;

import com.example.virosample.model.ProductManagerDB;

/**
 * Create a reference cache of ProductManagerDB in the application layer so as to be able to
 * access product data across our activities.
 */
public class ProductApplicationContext extends Application {
    private ProductManagerDB mProductDB;

    public ProductManagerDB getProductDB(){
        if (mProductDB == null){
            mProductDB = new ProductManagerDB();
        }

        return mProductDB;
    }
}
