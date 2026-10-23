package UMLdiagram.Practice3_cinema;
import java.time.LocalDateTime;


public class ShowTime {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    
    public ShowTime(LocalDateTime starTime, LocalDateTime endTime) {
        this.startTime = starTime;
        this.endTime = endTime;
    }

    public LocalDateTime getStarTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setStarTime(LocalDateTime starTime) {
        this.startTime = starTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "ShowTime [" +
                "Start=" + startTime +
                ", End=" + endTime +
                ']';
    }
}
