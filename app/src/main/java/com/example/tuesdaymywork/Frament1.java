package com.example.tuesdaymywork;


import android.content.Intent;
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
public class Frament1 extends Fragment {

    Button btn;
    Button btn2;
    EditText name;


    public Frament1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_frament1, container, false);
        btn = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        name = view.findViewById(R.id.data);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Hello",Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(),"Hello",Toast.LENGTH_SHORT).show();


               // Intent intent = new Intent(getContext())
            }
        });



         return view;
    }

}
