import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
    static int nQuestions = 0;
    static int nCorrect= 0;
    String question;
    String CorrectAnswer;

    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer){
        question = query+"\n";
        question += "A. "+a+"\n";
        question += "B. "+b+"\n";
        question += "C. "+c+"\n";
        question += "D. "+d+"\n";
        question += "E. "+e+"\n";
        CorrectAnswer = answer;
        CorrectAnswer = answer.toUpperCase();

    }

    String ask(){

        while(true){

            String answer = JOptionPane.showInputDialog(question);
            answer= answer.toUpperCase();

            boolean valid= (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")||answer.equals("E"));
            if(valid){
                return answer;
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E");
            }

        }

    }

    void check() {
        nQuestions++;
        String answer = ask();
        if (answer.equals(CorrectAnswer)) {
            JOptionPane.showMessageDialog(null, "Congrats! correct answer");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null, "sorry wrong answer. The right answer is " + CorrectAnswer + ".");
        }
    }

    static void showResults(){
        JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+ nQuestions+" questions.");
    }



}



