package application;

import entities.Lesson;
import entities.Task;
import entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantityLessons;

        System.out.print("How many Lessons does the  course have? ");
        quantityLessons = sc.nextInt();

        List<Lesson> lessons = new ArrayList<>();

        for (int i = 1; i <= quantityLessons; i++) {

            System.out.println("\nData from the " + i + "st class:");
            System.out.print("Content or task (c/t)? ");
            char lessonType = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            if (lessonType == 'c') {

                System.out.print("Video URL: ");
                String urlVideo = sc.nextLine();

                System.out.print("Duration in seconds: ");
                int secondsVideo = sc.nextInt();

                Lesson lessonContent = new Video(urlVideo, secondsVideo);

                lessons.add(lessonContent);

            } else {

                System.out.print("Description: ");
                String descriptionTask = sc.nextLine();

                System.out.print("Number of questions: ");
                int questionCount = sc.nextInt();

                Lesson lessonTask = new Task(descriptionTask, questionCount);

                lessons.add(lessonTask);

            }

        }

        int totalDuration = 0;

        for (Lesson lesson : lessons) {
            totalDuration += lesson.duration();
        }

        System.out.printf("\nTotal course duration = %d seconds", totalDuration);

        sc.close();
    }
}
