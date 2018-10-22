package model;

public class HomeworkEval extends Evaluation {
    private String name;

    //MODIFIES: this
    //EFFECTS: constructs a HomeworkEval and sets name and outOf to parameter values
    public HomeworkEval(String name, Integer outOf) {
     super(outOf);
     this.name = name;
    }


    //EFFECTS: returns name
    public String getName() {
        return name;
    }

    @Override
    //EFFECTS: if the student got below 50% on their assignment, return a statement saying they struggled,
    //         otherwise return an empty string
    public String studentNeeds(){
        if (this.calculateGrade() < 50.00) {
            return " struggled with " + name + ", and";
        } else{
            return "";
        }
    }
}