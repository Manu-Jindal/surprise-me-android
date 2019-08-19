package com.ramotion.foldingcell.examples.listview;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.ramotion.foldingcell.FoldingCell;
import com.ramotion.foldingcell.examples.R;

import in.myinnos.androidscratchcard.ScratchCard;

public class ScratchDialog extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.scratch_panel, container, false);
        final Bundle args = getArguments();

        TextView SuccessScratchTextView = (TextView) view.findViewById(R.id.SuccessScratchTextView);
        int day = args.getInt("position");
        SuccessScratchTextView.setText("YOU HAVE SUCCESSFULLY UNLOCKED\nDAY "+day+"!");


        final ScratchCard mScratchCard;
        mScratchCard = (ScratchCard) view.findViewById(R.id.scratchCard);
        mScratchCard.setOnScratchListener(new ScratchCard.OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.3) {
                    mScratchCard.setVisibility(View.GONE);
                    //Toast.makeText(getContext(), "Content Visible", Toast.LENGTH_SHORT).show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            if(getDialog() != null){
                                getDialog().dismiss();
                            }
                        }
                    }, 2000);   //5 seconds


                }
            }
        });

        return view;
    }
}
