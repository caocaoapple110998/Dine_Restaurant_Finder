package com.example.asus.dine_restaurant_finder.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.Event.Demo;

import java.util.ArrayList;

public class FragmentDemo extends Fragment {

    ListView lvdemo;
    ArrayList<Demo> arrayListdemo;

//    private FragmentActivity myContext;
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.demo_gridview, container, false);
//    }
//
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        Toast.makeText(getActivity(), "abc", Toast.LENGTH_SHORT).show();
//
//        lvdemo = (ListView) view.findViewById(R.id.lvdemo);
//        adapterdemo = new Demo_Adapter(getContext(), R.layout.dong_demo, arrayListdemo);
//        lvdemo.setAdapter(adapterdemo);
//        arrayListdemo = new ArrayList<>();
//        arrayListdemo.add(new Demo(
//           "conacbamasdasd",
//           "conacdumasdasdm"
//        ));
//        arrayListdemo.add(new Demo(
//                "conacbamasdasd",
//                "conacdumasdasdm"
//        ));
//        arrayListdemo.add(new Demo(
//                "conacbamasdasd",
//                "conacdumasdasdm"
//        ));
//        arrayListdemo.add(new Demo(
//                "conacbamasdasd",
//                "conacdumasdasdm"
//        ));
//        initial(view);


    private TextView tv;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private void initial(View view) {
//        viewPager = (ViewPager) view.findViewById(R.id.viewPagerHome);
//        tabLayout = (TabLayout) view.findViewById(R.id.tabLayoutHome);
    }




}
