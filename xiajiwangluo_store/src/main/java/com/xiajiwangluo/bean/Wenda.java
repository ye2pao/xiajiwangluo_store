package com.xiajiwangluo.bean;

public class Wenda {
    private String question;

    private String answer;

    @Override
	public String toString() {
		return "Wenda [question=" + question + ", answer=" + answer + "]";
	}

	public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}