package com.example.android.fragment1;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment extends Fragment {


    FirstFragment firstFragment;

    public TestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test, container, false);

        final EditText text = (EditText) view.findViewById(R.id.editText1);



        Button btn1 = (Button) view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Hello Btn1 = "+text.getText().toString(),Toast.LENGTH_SHORT).show();

                /*
                MainActivity activity = (MainActivity) getActivity();
                activity.sendData("heelo");
                */

                firstFragment.sendData(text.getText().toString());
            }
        });


        return view;
        //return
    }

    public interface FirstFragment {
        void sendData(String message);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        firstFragment = (FirstFragment) context;
    }
}
