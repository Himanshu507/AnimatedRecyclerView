package com.hoax.animatedrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<SetData> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mData = new ArrayList<>();
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));
        mData.add(new SetData("Product 1","Take strikingly clear photos with the 12MP + 5MP AI dual camera. 1.25μm large pixels on the primary lens capture the beauty of any scene","$50",R.drawable.ic_launcher_background));

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        SimpleRecyclerAdapter adapter = new SimpleRecyclerAdapter(this,mData);
        recyclerView.setAdapter(adapter);
    }

}
