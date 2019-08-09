package basics;

public class Interfacemobile {
	
	public static void main(String [] args)
{
	
	
	Mobile m = new Mobile();
	m.play();
}	


}
interface Radio
{
	
int FREQUENCY = 1000;
void play();
}

interface MusicPlayer
{
void songslist();	
}

interface ModernMusicPlayer extends MusicPlayer
{
	
void playStreamSongs();
}

class Mobile implements MusicPlayer,Radio
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
@Override
public void songslist() {
	// TODO Auto-generated method stub
	
}
}






