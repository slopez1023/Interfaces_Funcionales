public class Exam1 {
    private String Subject1;
    private boolean Done;

    public Exam1 ( String Subject1,boolean Done){
        this.Subject1 = Subject1;
        this.Done = Done;
    }

    public String getSubject1() {
        return Subject1;
    }

    public void setSubject1(String subject1) {
        Subject1 = subject1;
    }

    public boolean isDone() {
        return Done;
    }

    public void setDone(boolean done) {
        Done = done;
    }
}
