

public class Quiz {
    public static void main(String[] args){
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("What is capital of India?",
                "Delhi", "Mumbai", "Bangalore", "Gujarat", "Haryana", "a");
        question1.check();


        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("How many months are in a year?",
                "6", "12", "15", "10", "11", "b");
        question2.check();


        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("Who is the current president of USA?",
                "Barack Obama", "Micheal Jordan", "Donald Trump", "Joe Biden", "George Bush", "d");
                question3.check();


        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("Which Company manufactures Iphone?",
        "apple", "Samsung", "oppo", "Redmi", "Blackberry", "a");
        question4.check();


        MultipleChoiceQuestion question5 = new MultipleChoiceQuestion("Who is known as Father of India?",
                "Jhwaharlal Nehru" ,"Bhagat Singh", "Mahatma Gandhi","Akbar", "Jinnah", "c");
        question5.check();


        MultipleChoiceQuestion question6 = new MultipleChoiceQuestion("On which day USA celebrate independence day?",
                 "4th July", "4th December", "15 August", "1 January", "20 December", "a");
        question6.check();

        MultipleChoiceQuestion.showResults();
    }
}

