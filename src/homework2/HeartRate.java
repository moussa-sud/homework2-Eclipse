package homework2;

public class HeartRate {
    private String Fullname;
    private int Birth;
    private int MHR;
    private double THR;

    HeartRate(String fullName, int birth) {
        this.Fullname = fullName;
        this.Birth = birth;
    }

    public String getFullname() {
        return Fullname;
    }

    public int MaxHeartrate() {
        return MHR = 220 - (Birth - 2023);
    }

    public int setTargetHeartrate() {
        int maxHeartRate = MaxHeartrate();
        return (int) (maxHeartRate * 0.85);
    }

    public void show() {
        int maxHeartRate = MaxHeartrate(); // Calculate max heart rate
        int targetHeartRate = setTargetHeartrate(); // Calculate target heart rate
        System.out.println("Name and last name: " + Fullname);
        System.out.println("Age: " + Birth);
        System.out.println("Max Heart Rate: " + maxHeartRate);
        System.out.println("Target Heart Rate: " + targetHeartRate);
    }
}

