import com.nicholas.spring.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);

        player1.play();

        context.close();
    }
}
