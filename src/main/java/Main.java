import com.nicholas.spring.AppConfig;
import com.nicholas.spring.MusicGenre;
import com.nicholas.spring.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);

        player1.play(MusicGenre.CLASSICAL);
        player1.play(MusicGenre.ROCK);
        player1.play(MusicGenre.JAZZ);

        context.close();
    }
}
