package com.blackhub.bronline.game.gui.legacy;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BrAudioDialogAdapter extends FragmentPagerAdapter {
    public List<Fragment> mFragmentCollection;
    public List<String> mTitleCollection;

    public BrAudioDialogAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.mFragmentCollection = new ArrayList();
        this.mTitleCollection = new ArrayList();
    }

    public void addFragment(String title, Fragment fragment) {
        this.mTitleCollection.add(title);
        this.mFragmentCollection.add(fragment);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int position) {
        return this.mTitleCollection.get(position);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int position) {
        return this.mFragmentCollection.get(position);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.mFragmentCollection.size();
    }
}
