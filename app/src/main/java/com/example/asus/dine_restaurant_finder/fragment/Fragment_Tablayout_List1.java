package com.example.asus.dine_restaurant_finder.fragment;


import android.support.v4.app.Fragment;

public class Fragment_Tablayout_List1 extends Fragment {
//    private FragmentActivity myContext;
//    private Toolbar toolbar;
//    private ViewPager fragment_viewPager;
//    private TabLayout fragment_tabLayout;
//
//    public static Home_Fragment newInstance() {
//        Home_Fragment fragment = new Home_Fragment();
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.fragment_tablayout_list_1, container, false);
//
//        fragment_viewPager = (ViewPager) v.findViewById(R.id.viewPagerHome);
//        fragment_tabLayout = (TabLayout) v.findViewById(R.id.tabLayoutHome);
//
//        setupViewPager(fragment_viewPager);
//        fragment_tabLayout.setupWithViewPager(fragment_viewPager);
//
//        toolbar = (Toolbar) v.findViewById(R.id.toolbar);
//        AppCompatActivity activity = (AppCompatActivity) getActivity();
//        activity.setSupportActionBar(toolbar);
//
//
//
//        return v;
//    }
//    //////////////////////////////////////////////////////////////////////////////////
//
//    private void setupViewPager(ViewPager viewPager) {
//        FragmentManager fragManager = myContext.getSupportFragmentManager();
//        ViewPagerAdapterHD1 adapter = new ViewPagerAdapterHD1(fragManager);
//        adapter.addFragment(new Fragment_Tablayout_List1(), "Home");
//        adapter.addFragment(new FragmentDemo(), "Profile");
//        viewPager.setAdapter(adapter);
//    }
//
//
//    @Override
//    public void onAttach(Activity activity) {
//        myContext=(FragmentActivity) activity;
//        super.onAttach(activity);
//    }
//
//
//
//
//    public static class ViewPagerAdapterHD1 extends FragmentPagerAdapter {
//        private List<Fragment> mFragmentList = new ArrayList<>();
//        private List<String> mFragnebtTitleList = new ArrayList<>();
//
//        public ViewPagerAdapterHD1(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return mFragmentList.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        public void addFragment(Fragment fragment, String title){
//            mFragmentList.add(fragment);
//            mFragnebtTitleList.add(title);
//        }
//
//        @Nullable
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mFragnebtTitleList.get(position);
//        }
//    }
//
/////////////////////////////////////////////////////////////////////////////////////////////
//    public boolean onCreateOptionsMenu( Menu menu) {
//        getActivity().getMenuInflater().inflate( R.menu.menu_search_toolbar, menu);
//
//
//        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
//        final SearchView searchView = (SearchView) myActionMenuItem.getActionView();
//        searchView.setQueryHint("Search by landmark");
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                if (TextUtils.isEmpty(newText)) {
//
//                } else {
//                }
//                return true;
//            }
//        });
//
//        return true;
//    }

}
