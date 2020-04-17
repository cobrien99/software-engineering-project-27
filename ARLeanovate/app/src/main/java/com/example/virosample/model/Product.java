
package com.example.virosample.model;

/**
 * Product class containing all properties relating to a product, like name, image, or model.
 */
public class Product {
    public final String mName;
    public final int mImage;
    public final String m3DModelUri;
  //  public final String mUrlWebPage;

    public Product(String name, int image, String modelAsset){
        mName = name;
        mImage = image;
        m3DModelUri = modelAsset;
    //    mUrlWebPage = webpage;
    }
}
