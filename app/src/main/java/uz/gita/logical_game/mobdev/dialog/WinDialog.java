package uz.gita.logical_game.mobdev.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import uz.gita.logical_game.mobdev.Home;
import uz.gita.logical_game.mobdev.R;

public class WinDialog extends AlertDialog {
    private Context context;
    private View view;
    EventListener eventListener;

    public WinDialog(Context context) {
        super(context);
        view = LayoutInflater.from(context).inflate(R.layout.windialog, null);
        setView(view);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view.findViewById(R.id.yes_win).setOnClickListener(view1 -> {
            Intent intent = new Intent(context  , Home.class);
            eventListener.listener(intent);
        });
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}
