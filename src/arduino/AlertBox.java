package arduino;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sun.plugin.javascript.navig.Window;

public class AlertBox
{
	Alert alertWindow;
	Stage stage;
	public AlertBox(String title, String message, String text)
	{
		alertWindow = new Alert(Alert.AlertType.ERROR);
		alertWindow.setTitle(title);
//		alertWindow.setUndecorated(true);
//		alertWindow.setSize(obj);
//		alertWindow.setPreferredSize(obj);
//		alertWindow.setLayout(new BorderLayout());
//		alertWindow.setLocationRelativeTo(null);
//		alertWindow.setAlwaysOnTop(true);
		alertWindow.setHeaderText(message);
		alertWindow.setContentText(text);
//		JLabel lblMessage = new JLabel(message, SwingConstants.CENTER);
//		lblMessage.setFont(new Font("Arial", Font.BOLD, 18));
//		JButton btnOk = new JButton("OK");
//		btnOk.setFont(new Font("Arial", Font.BOLD, 12));
//
//		ImageIcon icon = new ImageIcon(getClass().getResource("/err.png"));
//		JLabel obrazokChyby = new JLabel(icon);

//		btnOk.addActionListener(new ActionListener()
//		{
//
//			@Override
//			public void actionPerformed(ActionEvent e)
//			{
//				alertWindow.setVisible(false);
//				alertWindow.dispose();
//			}
//
//		});
//
//		alertWindow.add(obrazokChyby, BorderLayout.NORTH);
//		alertWindow.add(btnOk, BorderLayout.SOUTH);
//		alertWindow.add(lblMessage, BorderLayout.CENTER);

		// Get the Stage.
		stage = (Stage) alertWindow.getDialogPane().getScene().getWindow();

		// Add a custom icon.
		stage.getIcons().add(new Image(getClass().getResourceAsStream("errorIco.png")));
	}
	
	public void display()
	{
		alertWindow.showAndWait();
	}
}
