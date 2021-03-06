package di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        try (
                AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()
        ) {
            context.scan("di");
            context.refresh();
            StartUI ui = context.getBean(StartUI.class);
            ui.add("Petr Arsentev");
            ui.add("Ivan ivanov");
            ui.print();
            ui.ask("Ask ");
        }
    }
}