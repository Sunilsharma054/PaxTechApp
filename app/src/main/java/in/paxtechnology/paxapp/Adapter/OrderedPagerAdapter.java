package in.paxtechnology.paxapp.Adapter;

import in.paxtechnology.paxapp.Fragment.PhysicalCardFragment;
import in.paxtechnology.paxapp.Fragment.VirtualCardFragment;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class OrderedPagerAdapter extends FragmentPagerAdapter {
    public OrderedPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new VirtualCardFragment();
        }
        else if (position == 1)
        {
            fragment = new PhysicalCardFragment();

        }
        return fragment;
        }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "VIRTUAL CARDS";
        }
        else if (position == 1)
        {
            title = "PHYSICAL CARDS";
        }

        return title;
    }
    }

