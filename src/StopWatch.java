
import java.sql.Time;
import java.util.Date;

public class StopWatch {
    private long startTime, endTime;


    public long getStartTime() {
        startTime=System.currentTimeMillis();
       // System.out.println(startTime+" ssssssssss");
        return startTime;

    }

    public long getEndTime() {
        endTime=System.currentTimeMillis();
        //System.out.println(endTime+"");
        return endTime;
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }
}
