package gamefight;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        GameConfiguration gameConfiguration = new GameConfiguration();
        Game game = new Game(gameConfiguration);
        game.start();
    }
// TODO: 14.04.2020
// Зачем идти в башню
// Время между походами в башню 10 минут
// Последствия смерти(потеря денег или шанс дропа вещей)
// Какие действия можно совершать в башне
// Условие перехода на другой этаж(можно но ли уйти с этажа без смерти)/должен убить всех монстров на этаже
// Возвращение на этаж ниже, причина возвращение
// Босс в конце каждого 10 этажа
// Что ты получишь в конце
//
// На ход в башню дается 5 очков действий - поменять монстра/ полечиться/ использовать заклинаение на следующем монстре/
//
// Заходим на уровень, убиваем монстров и на деньги улучшаем параметры или покупаем шмот, крафтим.
// Когда смогли преодолеть последнего монстра на уровне, тогда мы можем перейти на следующий уровень или уйти
// Цель - добыть столько золота, чтоб перейти на следующий уровень, нужно ли вручную бить монстров или автоматом
//
//

}