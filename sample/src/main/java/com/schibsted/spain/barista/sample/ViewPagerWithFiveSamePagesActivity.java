package com.schibsted.spain.barista.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class ViewPagerWithFiveSamePagesActivity extends FragmentActivity {

  private static final int NUM_PAGES = 5;

  private ViewPager pager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_viewpager);

    PagerAdapter adapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
    pager = (ViewPager) findViewById(R.id.pager);
    pager.setAdapter(adapter);
  }

  @Override
  public void onBackPressed() {
    if (pager.getCurrentItem() == 0) {
      super.onBackPressed();
    } else {
      pager.setCurrentItem(pager.getCurrentItem() - 1);
    }
  }

  private static class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
    ScreenSlidePagerAdapter(FragmentManager fm) {
      super(fm);
    }

    @Override
    public Fragment getItem(int position) {
      return new ViewPagerButtonFragment();
    }

    @Override
    public int getCount() {
      return NUM_PAGES;
    }
  }
}
