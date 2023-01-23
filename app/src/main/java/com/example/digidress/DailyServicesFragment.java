package com.example.digidress;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DailyServicesFragment extends Fragment {

    private View view;

   /** // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
*/
    public DailyServicesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyOrderFragment.
     */
   /** // TODO: Rename and change types and number of parameters
    public static DailyServicesFragment newInstance(String param1, String param2) {
        DailyServicesFragment fragment = new DailyServicesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_daily_services, container, false);

        Button iron=view.findViewById(R.id.ironing_btn_daily_ser);
        iron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iron_intent = new Intent(getActivity(),IronDryCleanWashActivity.class);
                startActivity(iron_intent);
            }
        });

        Button dry_clean=view.findViewById(R.id.dry_clean_btn_daily_ser);
        dry_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dry_intent=new Intent(getActivity(),IronDryCleanWashActivity.class);
                startActivity(dry_intent);
            }
        });

        Button normal_wash = view.findViewById(R.id.normal_wash_btn_daily_ser);
        normal_wash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent normalWashintent=new Intent(getActivity(),IronDryCleanWashActivity.class);
                startActivity(normalWashintent);
            }
        });

        Button weak_wash=view.findViewById(R.id.monthly_wash_btn_daily_ser);
        weak_wash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weakWashIntent=new Intent(getActivity(),IronDryCleanWashActivity.class);
                startActivity(weakWashIntent);
            }
        });

        Button fitting=view.findViewById(R.id.fitting_btn_daily_ser);
        fitting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fittingIntent=new Intent(getActivity(),IronDryCleanWashActivity.class);
                startActivity(fittingIntent);
            }
        });

        Button custom=view.findViewById(R.id.custom_btn_daily_ser);
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fittingIntent=new Intent(getActivity(),CustomActivity.class);
                startActivity(fittingIntent);

            }
        });

        return view;


    }
}