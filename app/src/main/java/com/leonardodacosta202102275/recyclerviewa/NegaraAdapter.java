package com.leonardodacosta202102275.recyclerviewa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NegaraAdapter extends RecyclerView.Adapter<NegaraViewHolder>
{
    private Context _context;
    private List<NegaraModel> _negaraModelList;

    public NegaraAdapter (Context context, List<NegaraModel> NegaraModelList)
    {
        this._context = context;
        this._negaraModelList = negaraModelList;
    }

    @NonNull
    @Override
    public NegaraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.layout_negara, parent,  false);
        return new NegaraViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NegaraViewHolder holder, int position) {
        NegaraModel nm = _negaraModelList.get(position);
        
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
