package com.jarbob.webapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.thefinestartist.finestwebview.FinestWebView;
import com.thefinestartist.finestwebview.webapp.R;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //super.setIntegerProperty("splashscreen", R.drawable.splash);
        setContentView(R.layout.main);

        new FinestWebView.Builder(this).titleDefault("江波波的个人主页")
                .showIconClose(false)


                .showMenuShareVia(true)

                .showMenuCopyLink(false)
               // .toolbarScrollFlags(2)



                .show("http://jarbob.com/");

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

//  public void onClick(View view) {
//    if (view.getId() == R.id.defaultTheme) {
//      new FinestWebView.Builder(this).titleDefault("The Finest Artist")
//              .show("http://thefinestartist.com");
//      ////                    .toolbarScrollFlags(0)
//      //                    .webViewJavaScriptEnabled(true)
//      //                    .webViewUseWideViewPort(false)
//      ////                    .show("http://andrewliu.in/2016/01/30/聊聊Redis的订阅发布/");
//      //                    .show("http://www.youtube.com");
//    } else if (view.getId() == R.id.redTheme) {
//      //            Intent intent = new Intent(this, WebViewActivity.class);
//      //            startActivity(intent);
//      new FinestWebView.Builder(this).theme(R.style.RedTheme)
//              .titleDefault("Bless This Stuff")
//              .webViewBuiltInZoomControls(true)
//              .webViewDisplayZoomControls(true)
//              .dividerHeight(0)
//              .gradientDivider(false)
//              .setCustomAnimations(R.anim.activity_open_enter, R.anim.activity_open_exit,
//                      R.anim.activity_close_enter, R.anim.activity_close_exit)
//              .injectJavaScript("javascript: document.getElementById('msg').innerHTML='Hello "
//                      + "TheFinestArtist"
//                      + "!';")
//              .show("http://www.blessthisstuff.com");
//    } else if (view.getId() == R.id.blueTheme) {
//      new FinestWebView.Builder(this).theme(R.style.FinestWebViewTheme)
//              .titleDefault("Vimeo")
//              .showUrl(false)
//              .statusBarColorRes(R.color.bluePrimaryDark)
//              .toolbarColorRes(R.color.bluePrimary)
//              .titleColorRes(R.color.finestWhite)
//              .urlColorRes(R.color.bluePrimaryLight)
//              .iconDefaultColorRes(R.color.finestWhite)
//              .progressBarColorRes(R.color.finestWhite)
//              .stringResCopiedToClipboard(R.string.copied_to_clipboard)
//              .stringResCopiedToClipboard(R.string.copied_to_clipboard)
//              .stringResCopiedToClipboard(R.string.copied_to_clipboard)
//              .showSwipeRefreshLayout(true)
//              .swipeRefreshColorRes(R.color.bluePrimaryDark)
//              .menuSelector(R.drawable.selector_light_theme)
//              .menuTextGravity(Gravity.CENTER)
//              .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
//              .dividerHeight(0)
//              .gradientDivider(false)
//              .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
//              .show("http://example.com");
//    } else if (view.getId() == R.id.blackTheme) {
//      new FinestWebView.Builder(this).theme(R.style.FinestWebViewTheme)
//              .titleDefault("Dribbble")
//              .toolbarScrollFlags(0)
//              .statusBarColorRes(R.color.blackPrimaryDark)
//              .toolbarColorRes(R.color.blackPrimary)
//              .titleColorRes(R.color.finestWhite)
//              .urlColorRes(R.color.blackPrimaryLight)
//              .iconDefaultColorRes(R.color.finestWhite)
//              .progressBarColorRes(R.color.finestWhite)
//              .swipeRefreshColorRes(R.color.blackPrimaryDark)
//              .menuSelector(R.drawable.selector_light_theme)
//              .menuTextGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT)
//              .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
//              .dividerHeight(0)
//              .gradientDivider(false)
//              //                    .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
//              .setCustomAnimations(R.anim.slide_left_in, R.anim.hold, R.anim.hold,
//                      R.anim.slide_right_out)
//              //                    .setCustomAnimations(R.anim.fade_in_fast, R.anim.fade_out_medium, R.anim.fade_in_medium, R.anim.fade_out_fast)
//              .disableIconBack(true)
//              .disableIconClose(true)
//              .disableIconForward(true)
//              .disableIconMenu(true)
//              .show("https://dribbble.com");
//    }
//  }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
