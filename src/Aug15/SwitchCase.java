package Aug15;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		for (int artist=1;artist<=18;artist++) { // to print all together
		String SongName;
		// int artist =15; // Print for individual track
		// int artist =18; // Print for individual track
		
		switch(artist) {
		
		
		case 1: SongName=" 1. Like A prayer";
		break;
		
		case 2: SongName=" 2. Smells Like teen spirit";
		break;
		
		case 3: SongName=" 3. All Apologies";
		break;
		
		case 4: SongName=" 4. Sweet child O' mine";
		break;
		
		case 5: SongName=" 5. Smoke on the water";
		break;
		
		case 6: SongName=" 6. Another Brick in the wall";
		break;
		
		case 7: SongName=" 7. Rock you like a Hurricane";
		break;
		
		case 8: SongName=" 8. Dont Fear the Reaper";
		break;
		
		case 9:	SongName=" 9. Losing My Religon";
		break;
		
		case 10: SongName=" 10. Good Riddance";
		break;
		
		case 11: SongName=" 11. Carry On Wayward son";
		break;
		
		case 12: SongName=" 12. Sultans Of Swing";
		break;
		
		case 13: SongName=" 13. All Along The Watchtower";
		break;
		
		case 14: SongName=" 14. Welcome to the Jungle";
		break;
		
		case 15: SongName=" 15. Through Fire and Flames";
		break;
		
		case 16: SongName=" 16. Nothing Eles Matters";
		break;
		
		case 17: SongName=" 17. Livin On A Prayer";
		break;
		
		default: SongName=" Invalid Track number ";
		break;
		}
		
		System.out.println("Now playing your requested song : "+SongName);
		
		}}
}


