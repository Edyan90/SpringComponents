package EddyTurpo.Spring_first_lesson;

import EddyTurpo.Spring_first_lesson.entities.Menu;
import EddyTurpo.Spring_first_lesson.entities.Ordine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    //qui ci vanno i componenti da richiamare
    @Autowired
    private Menu menu;
    @Autowired
    private Ordine ordine;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Siamo su RUN");
        //menu.printMenu();
        ordine.printOrdineDetails();
        System.out.println("---------------");
        ordine.printContoTavolo();

        System.out.println("Siamo su FINE RUN");
    }
}
