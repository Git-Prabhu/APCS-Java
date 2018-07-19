public class FetchKarel extends SuperKarel
{
    public void run()
    {
       while (frontIsClear()) 
       {
           move();
            if (frontIsBlocked())
            {
                if (facingEast())
                {
                    faceNorth();
                }
                while (frontIsClear())
                {
                    
                move();
                    if (facingNorth())
                    {
                        turnLeft();
                    }
                    else
                    {
                        turnRight();
                    }
                move();
                }    
            }
                
        }
           
        if (ballsPresent())
            {
                takeBall();
            }
      
    }
    
    private void faceNorth()
    {
        if (notFacingNorth())
        {
            turnLeft();
        }
    }
       

}
