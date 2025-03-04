package desafio7.application;

import desafio7.entities.Lesson;
import desafio7.entities.Task;
import desafio7.entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Lesson> list = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int classes = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= classes; i++) {
            System.out.println("Dados da " + i + "a aula:");

            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Título: ");
            sc.nextLine();
            String title = sc.nextLine();
            if (ch == 'c') {
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int seconds = sc.nextInt();
                list.add(new Video(title, url, seconds));
            } else {
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int questions = sc.nextInt();
                list.add(new Task(title, description, questions));
            }
            System.out.println();
        }

        System.out.print("DURAÇÃO TOTAL DO CURSO = ");
        int totalDuration = 0;
        for (Lesson lesson : list) {
            totalDuration += lesson.duration();
        }
        System.out.print(totalDuration);


        sc.close();
    }
}
