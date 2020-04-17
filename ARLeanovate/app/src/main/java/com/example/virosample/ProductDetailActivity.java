
package com.example.virosample;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.example.virosample.model.Product;
import static com.example.virosample.ProductARActivity.INTENT_PRODUCT_KEY;

/**
Originally planned to display fitbit data but integration was not successful
 */

public class ProductDetailActivity extends Activity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button 
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
            mWebView.goBack();
            return true;
        }
        
        return super.onKeyDown(keyCode, event);
    }
}
