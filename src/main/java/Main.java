import com.nicholas.spring.AppConfig;
import com.nicholas.spring.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);

        player1.play();


        context.close();
    }
}
