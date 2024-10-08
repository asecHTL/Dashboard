package at.htlgkr.dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import at.htlgkr.dashboard.databinding.FragmentDashboardBinding;


public class Dashboard extends Fragment implements IDashboard {

    private FragmentDashboardBinding binding;


    public Dashboard() {
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
        return binding.getRoot();

    }

    @Override
    public String displayableTemperature() {
        
        return "";
    }

    @Override
    public String displayablePressure() {
        return "";
    }

    @Override
    public String displayableSpeed() {
        return "";
    }

    @Override
    public String displayableTime() {
        return "";
    }
}