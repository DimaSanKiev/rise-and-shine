package io.dimasan.riseandshine.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuotesLoader {

    private Random randomGenerator;
    private List<String> rises;
    private List<String> shines;

    public QuotesLoader() {
        randomGenerator = new Random();
        rises = new ArrayList<>();
        shines = new ArrayList<>();

        rises.add("Пробудись");
        rises.add("Встань");
        rises.add("Расчехлись");
        rises.add("Проснись");
        rises.add("Взойди");
        rises.add("Протри глаза");
        rises.add("Восстань");
        rises.add("Вскочи");
        rises.add("Поднимись");
        rises.add("Подымись");
        rises.add("Продри глаза");

        shines.add("бодрствуй");
        shines.add("работай");
        shines.add("действуй");
        shines.add("функционируй");
        shines.add("маневрируй");
        shines.add("взаимодействуй");
        shines.add("бди");
        shines.add("трудись");
        shines.add("занимайся");
        shines.add("будь у дел");
        shines.add("гни горб");
        shines.add("займись делом");
        shines.add("вкалывай");
        shines.add("корячься");
        shines.add("мозолься");
        shines.add("рви жилы");
        shines.add("гни хрип");
        shines.add("парься");
        shines.add("функциклируй");
        shines.add("шакаль");
        shines.add("фурычь");
        shines.add("гегемонь");
        shines.add("орудуй");
        shines.add("сооружай");
        shines.add("натирай мозоли");
        shines.add("корячься");
        shines.add("шуруй");
        shines.add("плыви против течения");
        shines.add("делай своё");
    }

    public String getRandomQuote() {
        int index = randomGenerator.nextInt(rises.size());
        StringBuilder sb = new StringBuilder();
        sb.append(" — ");
        sb.append(rises.get(index));
        sb.append(" и ");
        index = randomGenerator.nextInt(shines.size());
        sb.append(shines.get(index));
        sb.append("!");
        return sb.toString();
    }
}
