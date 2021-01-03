package ua.step.homework;

/**
 * В этом задании нет заготовленных методов.
 * Продумайте их самостоятельно.
 *
 * Королю нужно убить дракона, но в его казне мало средств
 * для покупки армии. Нужно создать программу, используя
 * методы, которая поможет рассчитать минимальное ко-
 * личество копейщиков, которое необходимо, чтобы убить
 * дракона. C клавиатуры вводятся данные:
 * - здоровья дракона;
 * - атаки дракона;
 * - здоровье одного копейщика;
 * - атака одного копейщика.
 * Защита, меткость и т. п. не учитывать. Копейщики наносят
 * удар первыми (общий нанесенный урон – это сумма атак
 * всех живых копейщиков). Если атака дракона превышает
 * значение жизни копейщика (например, у копейщика жиз-
 * ни – 10, а атака – 15), то умирает несколько копейщиков, а
 * оставшийся урон идет одному из копейщиков.
 *
 * Например, жизнь дракона – 500, атака – 55, жизнь одно-
 * го копейщика – 10, атака –10, а количество копейщиков при
 * данных условиях – 20.
 * Лог боя для данного примера должен выглядеть так:
 *
 * Итерация 15
 * Копейщики атакуют (урон 200) – у дракона осталось 300 жизней
 * Дракон атакует – осталось 15 копейщиков, один из которых ранен
 * (осталось 5 жизней)
 * Копейщики атакуют – у дракона осталось 150 жизней
 * Дракон атакует – осталось 9 копейщиков
 * Копейщики атакуют – у дракона осталось 60 жизней
 * Дракон атакует – осталось 4 копейщика, один из которых ранен
 * (осталось 5 жизней)
 * Копейщики атакуют – у дракона осталось 20 жизней
 * Дракон атакует и побеждает
 *
 *
 */
public class Task05 {
	public static void main(String[] args) {
		// TODO: проверяйте ваш код здесь
	}
}
