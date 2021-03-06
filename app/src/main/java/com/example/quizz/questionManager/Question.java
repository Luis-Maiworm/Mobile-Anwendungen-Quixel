package com.example.quizz.questionManager;

import com.example.quizz.data.gameData.Categories;
import com.example.quizz.data.gameData.Difficulties;
import com.example.quizz.data.gameData.Types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse {@code Question} beinhaltet alle Informationen die man für eine Frage benötigt. Sie werden
 * direkt aus der json Anfrage übernommen.
 */
public class Question implements Serializable {

    private String category;
    private String type;
    private String difficulty;
    private String question;
    private String correct_answer;
    private List<String> incorrect_answers;
    private boolean isCorrect;

    public Categories getCategory() {
        for(Categories c : Categories.values()){
            if(c.getName().equals(this.category)){
                return c;
            }
        }
        return null;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Types getType() {
        for(Types t : Types.values()){
            if(t.getName().equals(this.type)){
                return t;
            }
        }
        return null;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Difficulties getDifficulty() {
        for(Difficulties d : Difficulties.values()){
            if(d.getName().equalsIgnoreCase(this.difficulty)){
                return d;
            }
        }
        return null;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public String getCategoryString(){
        return this.category;
    }

    public String getTypeString(){
        return this.type;
    }

    public String getDifficultyString(){
        return this.difficulty;
    }

    public ArrayList<String> getAllAnswers() {
        ArrayList<String> allAnswers = new ArrayList<>();
        allAnswers.add(getCorrect_answer());
        allAnswers.addAll(getIncorrect_answers());

        return allAnswers;
    }

    public List<String> getIncorrect_answers() {
        return incorrect_answers;
    }

    public void setIncorrect_answers(List<String> incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
