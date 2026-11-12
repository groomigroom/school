package groomis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BtnTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	static boolean loginStatus = false;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BtnTest frame = new BtnTest();
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
	public BtnTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLabel = new JLabel("입금해 주세요. 많이 입금해 주실수록 좋습니다.");
		lblLabel.setFont(new Font("HY궁서B", Font.PLAIN, 12));
		lblLabel.setForeground(new Color(0, 128, 128));
		lblLabel.setBounds(87, 25, 272, 49);
		contentPane.add(lblLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("HY궁서B", Font.PLAIN, 12));
		textField.setBounds(162, 87, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("돈 입금하기");
		btnNewButton.setFont(new Font("HY궁서B", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginStatus = true;
				System.out.println(loginStatus);
				lblLabel.setText("돈이 입금되었습니다. 감사합니다.");
				textField.setText(textField.getText() + "더 입금해 주세요");
				System.out.println(lblLabel.getText());
			}
		});
		btnNewButton.setBounds(12, 122, 116, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("돈 더 보내기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblLabel.setText("돈 더 입금해 주시면 안되실까요?");
				textField.setText("돈 주세요");
			}
		});
		btnNewButton_1.setFont(new Font("HY궁서B", Font.BOLD, 12));
		btnNewButton_1.setBounds(22, 155, 116, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("돈을 보내주시면 좋겠어요");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblLabel.setText("돈 더 필요합니다");
				textField.setText("더 주세요 제발요");
			}
		});
		btnNewButton_2.setFont(new Font("HY궁서B", Font.BOLD, 12));
		btnNewButton_2.setBounds(150, 122, 177, 23);
		contentPane.add(btnNewButton_2);
	}
}
