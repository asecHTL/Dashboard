package at.htlgkr.dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import at.htlgkr.dashboard.databinding.FragmentDashboardBinding;


public class DashboardFragment extends Fragment{

    private FragmentDashboardBinding binding;
    private double speed;
    private String temp;
    private String time;
    private double preasure;



    public DashboardFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDashboardBinding.inflate(inflater,container,false);

        binding.bt01Left.setOnClickListener(s -> {

        });
        binding.bt01Right.setOnClickListener(s -> {

        });
        binding.bt02Left.setOnClickListener(s -> {

        });
        binding.bt02Right.setOnClickListener(s -> {

        });
        binding.bt03Left.setOnClickListener(s -> {

        });
        binding.bt03Right.setOnClickListener(s -> {

        });
        binding.bt04Left.setOnClickListener(s -> {

        });
        binding.bt04Right.setOnClickListener(s -> {

        });
        return binding.getRoot();



    }


}