package core.threads.clock;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;

public class SimpleClock extends JFrame
{
	private JLabel clockLabel = new JLabel();

	public SimpleClock()
	{
		// Установить заголовок
		setTitle("ClockThread");

		// Выравнять метку по горизонтали - есть такой метод у Label
		clockLabel.setHorizontalAlignment(SwingConstants.CENTER);

		// Установить размер шрифта для метки  - есть такой метод у Label
		// Для эт ого создаем шрифт и сразу его отдаем методу setFont
		Font f = new Font("Default", Font.BOLD + Font.ITALIC, 24);
		clockLabel.setFont(f);

		// Добавить метку на основную панель окна
		getContentPane().add(clockLabel);

		// Установить размеры окна
		setBounds(400, 300, 300, 100);

		// ОБРАТИТЬ ВНИМАНИЕ !!!
		// Создаем отдельный поток, который должен обновлять значение метки
		Thread thr = new MyThread(this);
		thr.start();
	}

	public static void main(String[] args)
	{
		SimpleClock cl = new SimpleClock();
		cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cl.setVisible(true);
	}

	public void setTime()
	{
		// Создаем объект для форматирования даты
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		// Устанавливаем новое значение для метки - сразу форматируем дату в строку и устанавливаем новый текст
		clockLabel.setText(df.format(Calendar.getInstance().getTime()));
	}
}
