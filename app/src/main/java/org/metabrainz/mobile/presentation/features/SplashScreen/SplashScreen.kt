package org.metabrainz.mobile.presentation.features.SplashScreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.os.PersistableBundle
import android.view.Window
import android.view.WindowManager
import org.metabrainz.mobile.R
import org.metabrainz.mobile.presentation.features.dashboard.DashboardActivity

class SplashScreen: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {

        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.splashscreen)

        //hiding title bar of this activity
        window.requestFeature(Window.FEATURE_NO_TITLE)
        //making this activity full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        Handler().postDelayed(Runnable {
            startActivity(Intent(this@SplashScreen,DashboardActivity::class.java))
        },5000)
    }
}