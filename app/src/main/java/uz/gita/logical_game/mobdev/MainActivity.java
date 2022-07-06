package uz.gita.logical_game.mobdev;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import java.util.List;

import uz.gita.logical_game.mobdev.controller.QuestionBank;
import uz.gita.logical_game.mobdev.model.Question;

public class MainActivity extends AppCompatActivity {

    private AppCompatTextView questions;
    private AppCompatTextView question;
    AppCompatButton option1;
    private final int size = 10;
    AppCompatButton option2;
    AppCompatButton option3;
    AppCompatButton option4;
    AppCompatButton nextBt;
    private List<Question> questionList;
    private int position = 0;
    private String selectedOptionUser = "";
    private Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //home btn
        final AppCompatImageView back = findViewById(R.id.backBtn);
        final AppCompatTextView typesSe = findViewById(R.id.typeSel);

        //question and questions count
        questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);

        //variants
        option1 = findViewById(R.id.variantA);
        option2 = findViewById(R.id.variantB);
        option3 = findViewById(R.id.variantC);
        option4 = findViewById(R.id.variantD);
        nextBt = findViewById(R.id.nextBtn);

        //questions type
        final String Type = getIntent().getStringExtra("type");
        typesSe.setText(Type);

        //question list return
        questionList = QuestionBank.getQuestion(Type);

        //start time
        /* startTimer(time);*/

        //fill question and var
        questions.setText(((position + 1) + "/" + 10));
        question.setText(questionList.get(0).getQuestion());
        option1.setText(questionList.get(0).getVariantA());
        option2.setText(questionList.get(0).getVariantB());
        option3.setText(questionList.get(0).getVariantC());
        option4.setText(questionList.get(0).getVariantD());


        //option answer
        option1.setOnClickListener(view -> {
            if (selectedOptionUser.isEmpty()) {
                selectedOptionUser = option1.getText().toString();
                option1.setBackgroundResource(R.drawable.wrong);
                option1.setTextColor(Color.WHITE);
                revealAnswer();
                questionList.get(position).setUserSelected(selectedOptionUser);
            }
        });
        option2.setOnClickListener(view -> {
            if (selectedOptionUser.isEmpty()) {
                selectedOptionUser = option2.getText().toString();
                option2.setBackgroundResource(R.drawable.wrong);
                option2.setTextColor(Color.WHITE);
                revealAnswer();
                questionList.get(position).setUserSelected(selectedOptionUser);
            }
        });
        option3.setOnClickListener(view -> {
            if (selectedOptionUser.isEmpty()) {
                selectedOptionUser = option3.getText().toString();
                option3.setBackgroundResource(R.drawable.wrong);
                option3.setTextColor(Color.WHITE);
                revealAnswer();
                questionList.get(position).setUserSelected(selectedOptionUser);
            }
        });
        option4.setOnClickListener(view -> {
            if (selectedOptionUser.isEmpty()) {
                selectedOptionUser = option4.getText().toString();
                option4.setBackgroundResource(R.drawable.wrong);
                option4.setTextColor(Color.WHITE);
                revealAnswer();
                questionList.get(position).setUserSelected(selectedOptionUser);
            }
        });

        //next question btn
        nextBt.setOnClickListener(view -> {
            if (selectedOptionUser.isEmpty()) {
                Toast.makeText(MainActivity.this, "Please select the option", Toast.LENGTH_SHORT).show();
            } else {
                changeNextQuestion();
            }
        });

        //home packages
        back.setOnClickListener(view -> {
            exit();
        });
    }

    /**
     * next Question
     */
    private void changeNextQuestion() {
        position++;
        if (position == 10) {
            nextBt.setText("Testni Tugatish");
            dialog = new Dialog(MainActivity.this);
            dialog.setContentView(R.layout.windialog);
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.setCancelable(false);

            AppCompatButton home = dialog.findViewById(R.id.yes_win);
            AppCompatTextView winText = dialog.findViewById(R.id.win2);
            winText.setText(("Siz berilgan savollardan \n" + getCorrectAnswer() + " tasiga javob berdiz"));
            home.setOnClickListener(view -> {
                startActivity(new Intent(MainActivity.this, Home.class));
                dialog.dismiss();
                finish();
            });
            dialog.show();
        }

        if (position < 10) {
            selectedOptionUser = "";

            option1.setBackgroundResource(R.drawable.variant_style2);
            option1.setTextColor(Color.parseColor("#62666A"));

            option2.setBackgroundResource(R.drawable.variant_style2);
            option2.setTextColor(Color.parseColor("#62666A"));

            option3.setBackgroundResource(R.drawable.variant_style2);
            option3.setTextColor(Color.parseColor("#62666A"));

            option4.setBackgroundResource(R.drawable.variant_style2);
            option4.setTextColor(Color.parseColor("#62666A"));


            questions.setText((position + 1) + "/" + 10);
            question.setText(questionList.get(position).getQuestion());
            option1.setText(questionList.get(position).getVariantA());
            option2.setText(questionList.get(position).getVariantB());
            option3.setText(questionList.get(position).getVariantC());
            option4.setText(questionList.get(position).getVariantD());
        } else {
            dialog = new Dialog(MainActivity.this);
            dialog.setContentView(R.layout.windialog);
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.setCancelable(false);

            AppCompatButton home = dialog.findViewById(R.id.yes_win);
            AppCompatTextView winText = dialog.findViewById(R.id.win2);
            winText.setText("Siz berilgan savollardan \n" + String.valueOf(getCorrectAnswer()) + " tasiga javob berdiz");
            home.setOnClickListener(view -> {
                startActivity(new Intent(MainActivity.this, Home.class));
                dialog.dismiss();
                finish();
            });
            dialog.show();
        }
    }

    /**
     * true answer count
     *
     * @return
     */
    private int getCorrectAnswer() {
        int correctAnswer = 0;
        for (int i = 0; i < questionList.size(); i++) {
            final String getUserSelectedAnswer = questionList.get(i).getUserSelected();
            final String getAnswer = questionList.get(i).getAnswer();
            if (getUserSelectedAnswer.equals(getAnswer)) {
                correctAnswer++;
            }
        }
        return correctAnswer;
    }

    /**
     * exit game
     */
    private void exit() {
        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.eixtdialog);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);

        AppCompatButton yes = dialog.findViewById(R.id.yes_exit);
        AppCompatButton no = dialog.findViewById(R.id.no_exit);
        yes.setOnClickListener(view1 -> {
            startActivity(new Intent(MainActivity.this, Home.class));
            dialog.dismiss();
            finish();
        });
        no.setOnClickListener(view2 -> {
            dialog.dismiss();
        });
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        exit();
    }

    /**
     * true and back
     */
    private void revealAnswer() {
        String getAnswer = questionList.get(position).getAnswer();
        if (option1.getText().toString().equals(getAnswer)) {
            option1.setBackgroundResource(R.drawable.btn_style);
            option1.setTextColor(Color.WHITE);
        } else if (option2.getText().toString().equals(getAnswer)) {
            option2.setBackgroundResource(R.drawable.btn_style);
            option2.setTextColor(Color.WHITE);
        } else if (option3.getText().toString().equals(getAnswer)) {
            option3.setBackgroundResource(R.drawable.btn_style);
            option3.setTextColor(Color.WHITE);
        } else if (option4.getText().toString().equals(getAnswer)) {
            option4.setBackgroundResource(R.drawable.btn_style);
            option4.setTextColor(Color.WHITE);
        }
    }
}