package groomis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class LoginShowing extends JFrame {

	static String id = "groomiiscute";
	static String pw = "1234groomi";
	static boolean loginStatus = false;
	
	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginShowing frame = new LoginShowing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginShowing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(166, 73, 116, 21);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setText("비밀번호입력하시오");
		textField2.setForeground(new Color(0, 0, 0));
		textField2.setColumns(10);
		textField2.setBounds(166, 117, 173, 21);
		contentPane.add(textField2);
		
		JLabel lblNewLabel = new JLabel("로그인");
		lblNewLabel.setFont(new Font("궁서", Font.PLAIN, 23));
		lblNewLabel.setBounds(120, 10, 202, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(63, 76, 91, 15);
		contentPane.add(lblId);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(63, 120, 91, 15);
		contentPane.add(lblPw);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputid = textField1.getText();
				String inputpw = textField2.getText();
				
				if (inputid.equals(id) && inputpw.equals(pw)) {
					lblNewLabel.setText("로그인 상태");
					loginStatus = true;
				} else {
					lblNewLabel.setText("나가세요");
					loginStatus = false;
					
				}

			}
		});
		btnNewButton.setBounds(172, 175, 97, 23);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(335, 175, 87, 76);
		contentPane.add(table);
	}
}
