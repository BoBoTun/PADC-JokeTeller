package xyz.aungpyaephyo.rpe.fragments;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;


import java.util.Calendar;

import xyz.aungpyaephyo.rpe.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class RegistrationFragment extends Fragment implements DatePickerDialog.OnDateSetListener {



    private EditText etDateOfBirth;

    public RegistrationFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        etDateOfBirth = (EditText) view.findViewById(R.id.e);

        etDateOfBirth.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    //showThirdPartyDatePicker();
                    showDatePicker();
                }
            }
        });

        etDateOfBirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showThirdPartyDatePicker();
                showDatePicker();
            }
        });

        return view;
    }

    private void showDatePicker(){
        DialogFragment newFragment = new MyDatePickerDialog();
        newFragment.show(getActivity().getSupportFragmentManager(), "datePicker");
    }
/*
    private void showThirdPartyDatePicker(){
        Calendar now = Calendar.getInstance();
        DatePickerDialog thirdPartyDatePicker = DatePickerDialog.newInstance(
                this,
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH)
        );
       // thirdPartyDatePicker.show(getActivity().getFragmentManager(), "ThirdPartyDatePicker");

    }

*/
    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Toast.makeText(getContext(), "Year : " + year + " Month : " + monthOfYear + " Day : " + dayOfMonth, Toast.LENGTH_SHORT).show();
    }
}