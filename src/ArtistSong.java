
public class ArtistSong {

	public static void main(String[] args) {
		
		//the following code will run all the tracks and on 18th run it will show invalid month.
		
		/* to run specific song, I shall have to remove for loop and remove the first { after the line and remove one at the end
		and write int adele=15/19 (the track number); */
			
			for (int adele=1; adele<=18; adele++){
			//int adele=15;
			String adeleString;
			switch (adele) {
			case 1: adeleString="1. All I Ask";
			break;
			case 2: adeleString="2. Be Divine";
			break;
			case 3: adeleString="3. Best for Last";
			break;
			case 4: adeleString="4. Can't Let Go";
			break;
			case 5: adeleString="5. Chasing Pavements";
			break;
			case 6: adeleString="6. Cold Shoulder";
			break;
			case 7: adeleString="7. Crazy for You";
			break;
			case 8: adeleString="8. Daydreamer";
			break;
			case 9: adeleString="9. Don't You Remember";
			break;
			case 10: adeleString="10. Every Glance";
			break;
			case 11: adeleString="11. First Love";
			break;
			case 12: adeleString="12. He Won't Go";
			break;
			case 13: adeleString="13. Hello";
			break;
			case 14: adeleString="14. Hiding My Heart";
			break;
			case 15: adeleString="15. Hometown Glory";
			break;
			case 16: adeleString="16. I Found a Boy";
			break;
			case 17: adeleString="17. I Miss You";
			break;
			default: adeleString="Invalid Song";
			break;
			}
			System.out.println(adeleString);
				
		
			}
		
		}

}
