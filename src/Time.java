public class Time
{

	private String time;
	private int hour;
	private int min;		//minutes
	
	/**
	 * testing only constructor
	 */
    public Time()
    {
        
    }
    
    /**
     * give time as "HH:MM"
     */
    public Time(String time)
    {
        try
        {
            this.time= time;
            if(Integer.parseInt(time.substring(0,2)) < 24 && Integer.parseInt(time.substring(3))<60)
            {
            this.hour=Integer.parseInt(time.substring(0, 2));
            this.min =Integer.parseInt(time.substring(3));
            }
            else
            {
            hour= 00;
            min= 00;
            }
        }
        catch (NumberFormatException e)
        {
            this.time = "0000";
            hour= 00;
            min= 00;
        }
        
    }
    
    
    /**
     * 
     * @return amount of hours
     */
    public int getHour()
    {
       return hour;
    }
    
    /**
     * @return amount of mins
     */
    public int getMin()
    {
        return min;
    }
    
    /**
     *  @return time in HH:MM format
     */
    public String toString()
    {
        if(hour < 10 && min < 10)
        return "0" + hour + ":" + "0" + min;
        if(hour < 10)
        return "0" + hour + ":" + min;
        if(min < 10)
        return hour + ":" + "0" + min;
        
        return hour + ":" + min;
    }
    
    /**
     * 
     * @return returns the time variable as just a normal string
     */
    public String getTime()
    {
        return time;
    }
    
    
    /**
     * @return convert the time to minutes 
     */
    public int timeToMins()
    {
        return (hour *60) + min;
    }
    
    /**
     *  This function checks if a time (beginT2 and  endT2) is between the period of begintT1 and endT1 and returns wether it "overlaps" or not
     * @param beginT1 first begin time
     * @param beginT2 second begin time
     * @param endT1 first end time
     * @param endT2 sencond end time
     * @return
     */
    public boolean isOverlapping(Time beginT1,Time endT1,Time beginT2, Time endT2)
    {
        // more readable for the ifstatement
        int sT1 = beginT1.timeToMins();
        int sT2 = beginT2.timeToMins();
        int eT1 = endT1.timeToMins();
        int eT2 = endT2.timeToMins();
        
        // if the start time 2 is between period 1
        if(sT2 >= sT1 && sT2 <= eT1)
        return true;
        else
        {
            // if end time 2 is between period 1
        if(eT2 >= sT1 && eT2 <= eT1)
        return true;
        }
        return false;
    }
    
}
    
    
    
    
    
    
    