package org.metabrainz.mobile.presentation.features.KotlinDashboard

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import org.metabrainz.mobile.R
import org.metabrainz.mobile.databinding.KotlinDashboardLayoutBinding
import org.metabrainz.mobile.presentation.features.about.AboutActivity
import org.metabrainz.mobile.presentation.features.barcode.BarcodeActivity
import org.metabrainz.mobile.presentation.features.collection.CollectionActivity
import org.metabrainz.mobile.presentation.features.dashboard.DonateActivity
import org.metabrainz.mobile.presentation.features.taggerkotlin.KotlinTaggerAcitivty

class KotlinDashboardActivity: AppCompatActivity(){
    private lateinit var binding: KotlinDashboardLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = DataBindingUtil.setContentView(this, R.layout.kotlin_dashboard_layout)

        //navigation
        binding.dashboardTagId.setOnClickListener {
            startActivity(Intent(this, KotlinTaggerAcitivty::class.java))
        }
        binding.dashboardAboutId.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
        binding.dashboardCollectionId.setOnClickListener {
            startActivity(Intent(this, CollectionActivity::class.java))
        }
        binding.dashboardDonateId.setOnClickListener {
            startActivity(Intent(this,DonateActivity::class.java))
        }
        binding.dashboardScanId.setOnClickListener {
            startActivity(Intent(this,BarcodeActivity::class.java))
        }
    }
}