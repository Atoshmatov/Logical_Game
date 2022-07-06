package uz.gita.logical_game.mobdev.model;

public class Question {
    private String question;
    private String variantA;
    private String variantB;
    private String variantC;
    private String variantD;
    private String answer;
    private String userSelected;


    public Question(String question, String variantA, String variantB, String variantC, String variantD, String answer, String userSelected) {
        this.question = question;
        this.variantA = variantA;
        this.variantB = variantB;
        this.variantC = variantC;
        this.variantD = variantD;
        this.answer = answer;
        this.userSelected = userSelected;
    }

    public String getQuestion() {
        return question;
    }

    public String getVariantA() {
        return variantA;
    }

    public String getVariantB() {
        return variantB;
    }

    public String getVariantC() {
        return variantC;
    }

    public String getVariantD() {
        return variantD;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserSelected() {
        return userSelected;
    }

    public void setUserSelected(String userSelected) {
        this.userSelected = userSelected;
    }
}


