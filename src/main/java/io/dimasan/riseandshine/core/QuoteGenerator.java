package io.dimasan.riseandshine.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteGenerator {

    private Random randomGenerator;
    private List<String> rises;
    private List<String> shines;

    public QuoteGenerator() {
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
        rises.add("Подорвись");
        rises.add("Просейся");
        rises.add("Оживись");
        rises.add("Подымись");
        rises.add("Продри зенки");
        rises.add("Очнись ото сна");
        rises.add("Вырвись из объятий Морфея");
        rises.add("Воспрянь");
        rises.add("Вспыхни");
        rises.add("Взыграй духом");
        rises.add("Наполнись жизнью");
        rises.add("Обновись");
        rises.add("Вспрянь");
        rises.add("Приободрись");
        rises.add("Подними голову");
        rises.add("Подбодрись");
        rises.add("Опомнись");
        rises.add("Очухайся");
        rises.add("Опамятуйся");
        rises.add("Прийди в чувство");
        rises.add("Прийди в сознание");
        rises.add("Обмогнись");
        rises.add("Оправься");
        rises.add("Выйди из-за горизонта");
        rises.add("Повысся");
        rises.add("Поднимись над горизонтом");
        rises.add("Эрегируй");
        rises.add("Умножься");

        shines.add("бодрствуй");
        shines.add("работай");
        shines.add("действуй");
        shines.add("тяни лямку");
        shines.add("корпи");
        shines.add("функционируй");
        shines.add("маневрируй");
        shines.add("копти");
        shines.add("взаимодействуй");
        shines.add("бди");
        shines.add("трудись");
        shines.add("потей над чем-то");
        shines.add("занимайся");
        shines.add("спины не разгибай");
        shines.add("выбивайся из сил");
        shines.add("будь у дел");
        shines.add("гни горб");
        shines.add("займись делом");
        shines.add("ишачь");
        shines.add("впахивай");
        shines.add("рубись");
        shines.add("труби");
        shines.add("вези воз");
        shines.add("проливай пот");
        shines.add("работай без устали");
        shines.add("пыхти");
        shines.add("паши как лошадь");
        shines.add("рук не покладай");
        shines.add("авраль");
        shines.add("мастери");
        shines.add("шабашничай");
        shines.add("костоломь");
        shines.add("гни хребтину");
        shines.add("надрывайся");
        shines.add("вкалывай");
        shines.add("работай как проклятый");
        shines.add("корячься");
        shines.add("выйди из зоны комфорта");
        shines.add("работай как вол");
        shines.add("мантуль");
        shines.add("надрывай пуп");
        shines.add("будь на ходу");
        shines.add("работай в поте лица");
        shines.add("рви пупок");
        shines.add("работай до седьмого пота");
        shines.add("работай как лошадь");
        shines.add("мастрачь");
        shines.add("чертоломь");
        shines.add("мозолься");
        shines.add("рви жилы");
        shines.add("совершай работу");
        shines.add("гни хрип");
        shines.add("паши");
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
