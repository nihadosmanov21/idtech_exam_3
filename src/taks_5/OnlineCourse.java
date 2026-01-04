package taks_5;

import java.time.Duration;

public class OnlineCourse extends Course {
    String platform;
    int duration;

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    public void displayCourseDetails() {
        System.out.println("Course Details");
        System.out.println("Name: " + this.courseName);
        System.out.println("Instructor: " + this.instructor);
        System.out.println("Credits: " + this.credits);
        System.out.println("Platform: " + this.platform);
        System.out.println("Duration: " + this.duration);
    }

    public boolean isEligibleCertificate(int spendedHours) {

        return !(spendedHours < duration);

    }

    @Override
    public String toString() {
        return "platform='" + platform + '\'' +
                ", duration=" + duration +
                ", courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", credits=" + credits +
                '}';
    }
}
