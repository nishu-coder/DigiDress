package com.example.digidress;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class StichingFragment extends Fragment {

    private View view;

   /** // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
*/
    public StichingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StichingFragment.
     */
  /**  // TODO: Rename and change types and number of parameters
    public static StichingFragment newInstance(String param1, String param2) {
        StichingFragment fragment = new StichingFragment();
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
        view= inflater.inflate(R.layout.fragment_stiching, container, false);
        Button school= view.findViewById(R.id.school_btn_stiching);
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent schoolIntent=new Intent(getActivity(),SchoolActivity.class);
                startActivity(schoolIntent);

            }
        });

        Button office=view.findViewById(R.id.office_btn_stiching);
        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent officeIntent=new Intent(getActivity(),OfficeActivity.class);
                startActivity(officeIntent);

            }
        });

        Button party=view.findViewById(R.id.party_btn_stiching);
        party.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent partyIntent=new Intent(getActivity(),PartyActivity.class);
                startActivity(partyIntent);
            }
        });

        return view;
    }
}