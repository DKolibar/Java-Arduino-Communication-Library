package arduino;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AlertBox
{
	JFrame alertWindow;
	public AlertBox(Dimension obj, String title, String message)
	{
		alertWindow = new JFrame();
		alertWindow.setTitle(title);
		alertWindow.setUndecorated(true);
		alertWindow.setSize(obj);
		alertWindow.setPreferredSize(obj);
		alertWindow.setLayout(new BorderLayout());
		alertWindow.setLocationRelativeTo(null);
		alertWindow.setAlwaysOnTop(true);
		JLabel lblMessage = new JLabel(message, SwingConstants.CENTER);
		lblMessage.setFont(new Font("Arial", Font.BOLD, 18));
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Arial", Font.BOLD, 12));

		ImageIcon icon = new ImageIcon(getClass().getResource("/err.png"));
		JLabel obrazokChyby = new JLabel(icon);

		btnOk.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				alertWindow.setVisible(false);
				alertWindow.dispose();
			}

		});

		alertWindow.add(obrazokChyby, BorderLayout.NORTH);
		alertWindow.add(btnOk, BorderLayout.SOUTH);
		alertWindow.add(lblMessage, BorderLayout.CENTER);
	}
	
	public void display(){
		alertWindow.setVisible(true);
	}
}
