import java.awt.Color;

public class WeirdColorConverter extends ColorConverter
{

	public WeirdColorConverter()
	{
		repeatPeriod =765;
	}
	
	public Color colorFor(int N)
	{		
		Color temp = new Color(0,0,0);
		int tempNum = N%256;
		int zoneNum = N/256;
		if(zoneNum%3==0){
			temp = new Color(255-tempNum,tempNum,0);
		}
		else if (zoneNum%3==1){
			temp = new Color(0,255-tempNum,tempNum);
		}
		else if(zoneNum%3==2){
			temp = new Color(tempNum,0,255-tempNum);
		}
		return temp;
	}

}
