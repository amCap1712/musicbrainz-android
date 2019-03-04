package org.metabrainz.mobile.adapter.pager;

import android.content.res.Resources;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.metabrainz.mobile.App;
import org.metabrainz.mobile.R;
import org.metabrainz.mobile.api.data.search.entity.Artist;
import org.metabrainz.mobile.fragment.ArtistBioFragment;

public class ArtistPagerAdapter extends FragmentPagerAdapter {

    private Artist artist;

    private static final int[] TITLES = {R.string.tab_bio, R.string.tab_releases, R.string.tab_links,
            R.string.tab_edits};

    public ArtistPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ArtistBioFragment.newInstance(artist);
            case 1:
                //return ArtistReleaseGroupsFragment.newInstance();
            case 2:
                //return  LinksFragment.newInstance();
            case 3:
                //return EditFragment.newInstance(Entity.ARTIST);
        }
        return ArtistBioFragment.newInstance(artist);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Resources res = App.getContext().getResources();
        return res.getString(TITLES[position]);
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    public void setArtist(Artist artist){
        this.artist = artist;
    }
}
