package uz.gita.logical_game.mobdev;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;

public class Home extends AppCompatActivity {
    private String selectedTopic = "";
    private AppCompatImageView aboutApp;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
        final LinearLayoutCompat brain = findViewById(R.id.brain);
        final LinearLayoutCompat math = findViewById(R.id.math);
        final LinearLayoutCompat info = findViewById(R.id.information);
        final LinearLayoutCompat history = findViewById(R.id.history);
        final LinearLayoutCompat sport = findViewById(R.id.sport);
        final LinearLayoutCompat movie = findViewById(R.id.movie);
        final LinearLayoutCompat mixed = findViewById(R.id.mixed);
        aboutApp = findViewById(R.id.infoApp);
        aboutApp.setOnClickListener(view -> {
            dialog = new Dialog(Home.this);
            dialog.setContentView(R.layout.infodialod);
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.setCancelable(true);
            dialog.show();
        });

        final AppCompatButton start = findViewById(R.id.startQuiz);

        brain.setOnClickListener(view -> {
            selectedTopic = "Mantiqiy";
            brain.setBackgroundResource(R.drawable.selected);

            math.setBackgroundResource(R.drawable.type_style);
            info.setBackgroundResource(R.drawable.type_style);
            history.setBackgroundResource(R.drawable.type_style);
            sport.setBackgroundResource(R.drawable.type_style);
            movie.setBackgroundResource(R.drawable.type_style);
            mixed.setBackgroundResource(R.drawable.type_style);

        });
        math.setOnClickListener(view -> {
            selectedTopic = "Matematik";
            math.setBackgroundResource(R.drawable.selected);

            brain.setBackgroundResource(R.drawable.type_style);
            info.setBackgroundResource(R.drawable.type_style);
            history.setBackgroundResource(R.drawable.type_style);
            sport.setBackgroundResource(R.drawable.type_style);
            movie.setBackgroundResource(R.drawable.type_style);
            mixed.setBackgroundResource(R.drawable.type_style);
        });
        info.setOnClickListener(view -> {
            selectedTopic = "I Texnalogiya";
            info.setBackgroundResource(R.drawable.selected);

            math.setBackgroundResource(R.drawable.type_style);
            brain.setBackgroundResource(R.drawable.type_style);
            history.setBackgroundResource(R.drawable.type_style);
            sport.setBackgroundResource(R.drawable.type_style);
            movie.setBackgroundResource(R.drawable.type_style);
            mixed.setBackgroundResource(R.drawable.type_style);
        });
        history.setOnClickListener(view -> {
            selectedTopic = "Tarix";
            history.setBackgroundResource(R.drawable.selected);

            math.setBackgroundResource(R.drawable.type_style);
            brain.setBackgroundResource(R.drawable.type_style);
            info.setBackgroundResource(R.drawable.type_style);
            sport.setBackgroundResource(R.drawable.type_style);
            movie.setBackgroundResource(R.drawable.type_style);
            mixed.setBackgroundResource(R.drawable.type_style);
        });
        sport.setOnClickListener(view -> {
            selectedTopic = "Sport";
            sport.setBackgroundResource(R.drawable.selected);

            math.setBackgroundResource(R.drawable.type_style);
            brain.setBackgroundResource(R.drawable.type_style);
            info.setBackgroundResource(R.drawable.type_style);
            history.setBackgroundResource(R.drawable.type_style);
            movie.setBackgroundResource(R.drawable.type_style);
            mixed.setBackgroundResource(R.drawable.type_style);
        });
        movie.setOnClickListener(view -> {
            selectedTopic = "Kino";
            movie.setBackgroundResource(R.drawable.selected);

            math.setBackgroundResource(R.drawable.type_style);
            brain.setBackgroundResource(R.drawable.type_style);
            info.setBackgroundResource(R.drawable.type_style);
            sport.setBackgroundResource(R.drawable.type_style);
            history.setBackgroundResource(R.drawable.type_style);
            mixed.setBackgroundResource(R.drawable.type_style);
        });

        mixed.setOnClickListener(view -> {
            selectedTopic = "Aralash";
            mixed.setBackgroundResource(R.drawable.selected);

            math.setBackgroundResource(R.drawable.type_style);
            brain.setBackgroundResource(R.drawable.type_style);
            info.setBackgroundResource(R.drawable.type_style);
            sport.setBackgroundResource(R.drawable.type_style);
            movie.setBackgroundResource(R.drawable.type_style);
            history.setBackgroundResource(R.drawable.type_style);
        });

        start.setOnClickListener(view -> {
            if (selectedTopic.isEmpty()) {
                Toast.makeText(Home.this, "Please select the topic", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(Home.this, MainActivity.class);
                intent.putExtra("type", selectedTopic);
                startActivity(intent);
                finishAffinity();
            }
        });
    }
}